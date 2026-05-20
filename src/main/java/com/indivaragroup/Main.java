package com.indivaragroup;

import com.indivaragroup.converter.character.CharConversion;
import com.indivaragroup.converter.number.NumberConversion;
import com.indivaragroup.grading.students.dto.StudentDTO;
import com.indivaragroup.grading.students.service.GradeCalculation;
import com.indivaragroup.identity.Calculation;
import com.indivaragroup.movie.MovieLogic;
import com.indivaragroup.rumah.floor.dto.CeramicDTO;
import com.indivaragroup.rumah.floor.logic.CeramicLogic;
import com.indivaragroup.todoapp.constant.PriorityLevel;
import com.indivaragroup.todoapp.constant.TaskStatus;
import com.indivaragroup.todoapp.dto.AssigneeDTO;
import com.indivaragroup.todoapp.dto.SubTaskDTO;
import com.indivaragroup.todoapp.dto.TaskDTO;
import com.indivaragroup.todoapp.logic.TaskManagementLogic;
import com.indivaragroup.todoapp.repository.TaskRepository;
import com.indivaragroup.todoapp.service.WorkloadService;
import com.indivaragroup.type.array.TypeDataArray;
import com.indivaragroup.type.primitive.TypeDataNonPrimitive;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // ceramic
        System.out.println("House Floor / keramik");
        CeramicDTO ceramicDTO = new CeramicDTO();

        ceramicDTO.setNameCeramic("pokoknya bukan marmer");
        ceramicDTO.setTypeCeramic("murmer");

        CeramicLogic.showCeramic(ceramicDTO);
        System.out.println("================== \n");

        // calculate personal ID
        System.out.println("Registrations Personal ID");
        Calculation.calculateKtp(10000, 5000);
        System.out.println("================== \n");

        // scoring students
        System.out.println("Scoring STudents");
        StudentDTO.showStudents();
        System.out.println("================== \n");

        // narrowing and casting
        System.out.println("Narrowing / casting data number");
        NumberConversion numConversion = new NumberConversion();
        numConversion.wideningCasting();
        numConversion.narrowingCasting();
        System.out.println("================== \n");

        // typedata Primitive
        System.out.println("Primitive Data");
        TypeDataNonPrimitive typeDataPrimitive = new TypeDataNonPrimitive();
        typeDataPrimitive.showConversion();
        System.out.println("================== \n");

        // array
        System.out.println("Type data array");
        TypeDataArray typeDataArray = new TypeDataArray();
        typeDataArray.showArray();
        System.out.println("================== \n");

        // movie
        System.out.println("Favorit List video AV");
        MovieLogic movieList = new MovieLogic();
        movieList.movieList();
        System.out.println("================== \n");


        // TodoList
        TaskRepository taskRepository =
                new TaskRepository();

        List<TaskDTO> taskList =
                taskRepository.getAllTasks();

        TaskManagementLogic taskManagementLogic =
                new TaskManagementLogic();

        for (TaskDTO task : taskList) {

            taskManagementLogic.processTask(task);

            System.out.println();
        }

        WorkloadService workloadService =
                new WorkloadService();

        double workload =
                workloadService.calculateWorkload(
                        taskList,
                        "Verry"
                );

        System.out.println("Total Workload Verry : "
                + workload + " hours");
    }
}

//        // char conversion
//        CharConversion charConversion = new CharConversion();
//        charConversion.showCharConversion();
//
//        // grade
//        GradeCalculation.GradeChecking(60);



