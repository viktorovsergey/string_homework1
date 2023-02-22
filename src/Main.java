import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------Задача 1---------------------");
        //Представьте, что вы работаете в небольшой компании. Данные сотрудников
        // хранятся в неструктурированном формате. Бухгалтерия попросила написать программу,
        // в которой  можно работать с Ф. И. О. сотрудников.
        //
        //Напишите четыре строки:
        //
        //С именем firstName — для хранения имени.
        //С именем middleName — для хранения отчества.
        //С именем lastName — для хранения фамилии.
        //С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: «ФИО сотрудника — …».
        //
        //В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".

        task1();
        System.out.println("---------------------Задача 2---------------------");
        task2();
        System.out.println("---------------------Задача 3---------------------");
        task3();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "";
        fullName=lastName+" "+ " "+ firstName+ " "+ middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName );
        System.out.println();
    }
    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+ fullName.toUpperCase());
        System.out.println();
    }
    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName=fullName.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника - "+ fullName);

    }

}
