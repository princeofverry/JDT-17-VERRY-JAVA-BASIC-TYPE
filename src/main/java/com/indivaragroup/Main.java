package com.indivaragroup;

import com.indivaragroup.challenge.ChallengeAfterBreak;
import com.indivaragroup.challenge.ChallengeNewest;
import com.indivaragroup.converter.number.NumberConversion;
import com.indivaragroup.credit.RiskCredit;
import com.indivaragroup.elseifstatement.ElseIfStatement;
import com.indivaragroup.grading.students.dto.StudentDTO;
import com.indivaragroup.identity.Calculation;
import com.indivaragroup.ifstatement.IfStatement;
import com.indivaragroup.movie.MovieLogic;
import com.indivaragroup.operator.augmentedassignment.AugmentedAssignment;
import com.indivaragroup.operator.bitwise.BitwiseOperator;
import com.indivaragroup.operator.booleanoperator.BooleanOperator;
import com.indivaragroup.operator.compare.ComparingOperator;
import com.indivaragroup.operator.instanceofOperator.InstanceOfOperator;
import com.indivaragroup.operator.unary.UnaryOperator;
import com.indivaragroup.rumah.floor.dto.CeramicDTO;
import com.indivaragroup.rumah.floor.logic.CeramicLogic;
import com.indivaragroup.todoapp.dto.TaskDTO;
import com.indivaragroup.todoapp.logic.TaskManagementLogic;
import com.indivaragroup.todoapp.repository.TaskRepository;
import com.indivaragroup.todoapp.service.WorkloadService;
import com.indivaragroup.type.array.TypeDataArray;
import com.indivaragroup.type.primitive.TypeDataNonPrimitive;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//
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
        System.out.println("================== \n \n");

        // augmented assignment
        AugmentedAssignment augmentedAssignmentFunc = new AugmentedAssignment();
        System.out.print("this is showing augmented assignment a first then b last ");
        augmentedAssignmentFunc.AugmentedAssignmentShow();
        System.out.println("================== \n \n");

        // unary operator
        System.out.println("this is unary operator");
        UnaryOperator.unaryOperatorShow();
        System.out.println("================== \n \n");

        // comparing operator
        System.out.println("this is comparing operator");
        ComparingOperator.comparingOperatorShow();
        System.out.println("================== \n \n");

        // ini bitwise operator
        System.out.println("ini bitwise operator");
        BitwiseOperator.bitwiseOperatorShow();
        System.out.println("================== \n \n");

        // ini boolean operator
        System.out.println("ini operator boolean");
        BooleanOperator.booleanOperatorShow();
        System.out.println("================== \n \n");

        // isntanceof
        System.out.println("Ini oprator isntanceof");
        InstanceOfOperator.instanceOfOperatorShow();
        System.out.println("================== \n \n");

        // if statement
        System.out.println("Ini if statement");
        IfStatement.ifStatement();
        System.out.println("================== \n \n");

        // challange
        System.out.println("ini challenge");
        ChallengeAfterBreak.challangeAfterBreak();
        System.out.println("================== \n \n");

        // else statement
        System.out.println("Ini else statement");
        ElseIfStatement.elseIfStatement(60);
        System.out.println("================== \n \n");

        // challenge baru
        ChallengeNewest.challengeNewest(1, 2, "mobil");
        ChallengeNewest.challengeNewest(1, 1, "mobil");
        ChallengeNewest.challengeNewest(1, 1, "mobil");
        ChallengeNewest.challengeNewest(1, 4, "motor");
        ChallengeNewest.challengeNewest(2, 23, "motor");
        ChallengeNewest.challengeNewest(23, 1, "motor");


        System.out.println("#######################");

        // risk credit with every testcase
        // test case 1
        // expected ditolak karena umur
        RiskCredit.riskCredit(
                5_000_000,
                19,
                500_000_000,
                10
        );

        // test case 2
        // tenor lebih dari 20 tahun
        // expected ditolak sebab lama
        RiskCredit.riskCredit(
                10_000_000,
                30,
                300_000_000,
                25
        );

        // test case 3
        // ditolak
        // karena cicilan terlalu besar (secara perhitungan)
        RiskCredit.riskCredit(
                5_000_000,
                28,
                800_000_000,
                10
        );

        // test case 4
        // high value
        // gaji diatas 15 juta
        // cicilan kurang dari 30% gaji
        RiskCredit.riskCredit(
                20_000_000,
                30,
                500_000_000,
                15
        );

        // test case 5
        // umur 21-24
        // butuh penjamin
        // approved and butuh penjamin and high value credit
        RiskCredit.riskCredit(
                18_000_000,
                23,
                400_000_000,
                15
        );

        // test case 6
        // gaji 7 juta - 14.999
        // Umur lebih dari 25
        // Expected:
        // - Approved
        // - Medium Risk Credit
        RiskCredit.riskCredit(
                10_000_000,
                27,
                300_000_000,
                12
        );

        // TEST CASE 7
        // Tidak masuk kategori mana pun
        // Expected:
        // - Dipertimbangkan
        // - Kategori default
        RiskCredit.riskCredit(
                8_000_000,
                24,
                350_000_000,
                10
        );
    }

}

//        // char conversion
//        CharConversion charConversion = new CharConversion();
//        charConversion.showCharConversion();
//
//        // grade
//        GradeCalculation.GradeChecking(60);



