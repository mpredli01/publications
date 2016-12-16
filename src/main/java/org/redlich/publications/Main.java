package org.redlich.publications;

import org.redlich.publications.db.publications.authors.Authors;
import org.redlich.publications.db.publications.publications.Publications;
import org.redlich.publications.db.publications.publications.PublicationsImpl;
import org.redlich.publications.db.publications.publishers.Publishers;
import org.redlich.publications.db.publications.states.States;
import org.redlich.publications.db.publications.types.Types;

import java.util.Calendar;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import java.sql.Date;

import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.component.EntityManager;
import com.speedment.runtime.core.exception.SpeedmentException;
import com.speedment.runtime.field.trait.HasComparableOperators;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.PERSIST;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.REMOVE;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.STREAM;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.UPDATE;

public class Main extends Base {
    public static void main(String... param) {
        Main main = new Main();

        run("Builder",main::builderDemo);
        // run("Predicate",main::predicateDemo);
        run("Count",main::countDemo);
        run("KeyValue",main::keyValueDemo);
        // run("Finder",main::backwardFinderDemo);
        // run("BackwardFinder",main::finderDemo);
        run("Joins",main::joinDemo);
        // run("ManyToMany",main::manyToManyDemo);
        // run("ShortCirtuit",main::shortCircuitOfCount);
        // run("getter",main::getter);
        // run("setter",main::setter);
        // run("comparator",main::comparator);
        // run("advanced predicated",main::advancedPredicates);
        // run("Entity Manger",main::entityManagerDemo);
        // run("update",main::updateDemo);
        // run("delete",main::deleteDemo);
        // run("logging",main::logging);
        }

    private void builderDemo() {
        // A Builder-pattern can be used to create an entity.
        try {
            Publications newPublication = new PublicationsImpl();
            newPublication.setId(34);
            newPublication.setVersion(0);
            newPublication.setTypeId(1);
            newPublication.setTitle("Speedment Releases Stream ORM Version 3.0.1");
            newPublication.setAuthorId(1);
            newPublication.setPublisherId(2);
            newPublication.setDueDate(new Timestamp(Calendar.getInstance().getTime().getTime()));
            newPublication.setSubmitDate(new Timestamp(Calendar.getInstance().getTime().getTime()));
            newPublication.setPublishDate(new Timestamp(Calendar.getInstance().getTime().getTime()));
            newPublication.setUrl("https://www.infoq.com/news/2016/12/speedment-releases-version-3");

            Publications persistedPublication = publicationsManager.persist(newPublication);

            System.out.println(persistedPublication);
            }
        catch(SpeedmentException exception) {
            exception.printStackTrace();
            }
    }

    public void predicateDemo() {
        // Large quantities of data is reduced in-memory using predicates.
        }

    private void countDemo() {
        long publications = publicationsManager.stream().count();
        System.out.println("\nThere are " + publications + " publications");

        long count = publicationsManager.stream()
                .filter(Publications.AUTHOR_ID.equal(2L))
                .count();
        System.out.println("\nThere are " + count + " publications with id = 1");
        }

    private void keyValueDemo() {
        // key-value searches are optimised in the background!
        Optional<Authors> redlich = authorsManager.stream()
                .filter(Authors.LAST_NAME.equal("Redlich"))
                .findAny();
        System.out.println("\n" + redlich.toString());
        }

    private void joinDemo() {
        // There is always an STATE_ID. So finderBy() returns a Function<FK_ENTITY,ENTITY> 1:1
        List<States> statesList01 = authorsManager.stream()
                .map(statesManager.finderBy(Authors.STATE_ID)) /// No type control so we could as well use Authors.STATE_ID which is nullable
                .collect(toList());
        System.out.println(statesList01.toString());

        List<Authors> authorsList01 = statesManager.stream()
                .flatMap(authorsManager.finderBackwardsBy(Authors.STATE_ID)) // Stream<Authors> Backfinders are always Stream 1:N
                .collect(toList());
        System.out.println(authorsList01.toString());

        // There might be zero or one PUBLISHER_ID. So statesManager.finderByNullable(Authors.PUBLISHER_ID) returns a Stream with zero or one element
        List<Publishers> publishersList = publicationsManager.stream()
                .flatMap(publishersManager.finderByNullable(Publications.PUBLISHER_ID)) // Stream<Authors> not Optional<Authors> to enable flatMap
                .collect(toList());
        System.out.println(publishersList.toString());

        List<Authors> authorsList02 = statesManager.stream()
                .flatMap(authorsManager.finderBackwardsBy(Authors.STATE_ID)) // Stream<Authors> Backfinders are always Stream 1:N
                .collect(toList());
        System.out.println(authorsList02.toString());

        List<States> statesList02 = authorsManager.stream()
                .map(statesManager.finderBy(Authors.STATE_ID)) // Stream<Authors> not Optional<Authors> to enable flatMap
                .collect(toList());
        System.out.println(statesList02.toString());

        Map<States,List<Authors>> join = authorsManager.stream()
                .collect(
                        groupingBy(statesManager.finderBy(Authors.STATE_ID)) // Applies the finderBy(Authors.STATE_ID) classifier
                );
        System.out.println("join:" + join.toString());
        }

    private static void run(String name,Runnable method) {
        System.out.println();
        System.out.println("*** " + name + " Demo ***");
        method.run();
        }
    }
