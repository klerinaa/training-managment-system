package com.sda.trainingmanagmentsystem.repositories;

import com.sda.trainingmanagmentsystem.entities.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Long> {
    @Query(value = "select a from Activities a where a.date = :dates")
     List<Activities> findActivitiesByDate(@Param("dates") final LocalDate date);

    @Query(value = "select a from Activities a join a.classes c where c.classesId = :classesId")
     List<Activities> listActivitiesByClasses(@Param("classesId")final Long classesId);
    @Query(value = "select a from Activities a join a.instructor i where i.userId = :userId")
    List<Activities> findActivitiesByInstructor(@Param("userId") final Long userId);
}
