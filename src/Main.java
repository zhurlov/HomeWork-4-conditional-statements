public class Main {
    public static void main(String[] args) {

        //Тренировка перед выполнением Д/З
        System.out.println("Тренировка перед выполнением Д/З");

        System.out.println(10 < 12);
        System.out.println(7 < 5);

        boolean btrue = 4 < 2;
        boolean bfalse = false;
        System.out.println(btrue);
        System.out.println(bfalse);

        int number = 10;
        if (20 > number) {
            System.out.println("Выражение истина");
        }

        int number_1 = 10;
        if (20 > number_1) {
            System.out.println(number_1 + " < 20");
        } else {
            System.out.println(number_1 + " > 20");
        }


        int number_2 = 200;
        int number_3 = 150;
        if (number_2 > number_3) {
            System.out.println(number_2 + " больше " + number_3);
        } else if (number_2 < number_3) {
            System.out.println(number_2 + " меньше " + number_3);
        } else {
            System.out.println(number_2 + " равно " + number_3);
        }


        // Условные переменные, выполнение Д/З.
        System.out.println("Условные переменные, выполнение Д/З.");

        // Задание 1.
        int age = 18;
        if (20 > age){
        System.out.println("> " + age);
        }
        if (18 == age) {
            System.out.println("==" + 18);
        }
        if (18 > 17){
            System.out.println("< " + age);
        }
        // Задание 2.
        int child = 7;
        if (6 < child) {
            System.out. println("Ребенок ходит в школу так как ему больше " + child + " лет");
        }
        if (7 <= child){
            System.out.println ("Ребенок ходит в школу так как его возраст равен " + child + " годам");
        }

        int human = 18;
        if (19 > 18) {
            System.out.println("человек уже закончил школу и может отправляться в университет, его возраст > " + human + " лет" );
        }
        if (18 == 18) {
            System.out.println("человек уже закончил школу и может отправляться в университет, его возраст равен " + human + " годам");
        }
        // Задание 3.
        byte oneWagon = 102; // вместимомть одного вагона
        byte seating = 60; // рассчитан на 60 сидячих мест
        byte seatingLoad = 50; // загруженность сидячих
        int numberOfSeats = seating - seatingLoad; // количество сидячих мест
        int standingRoom = oneWagon - seating; // расчитан на 42 стоячих места
        int standingOccupancy = 15; // загруженность стоячих
        int numberOfStandingPlaces = standingRoom - standingOccupancy; // количество стоячих мест
        int totalFrePlaces = numberOfSeats + numberOfStandingPlaces; // всего свободных мест (стоячие +исидячие)
        if(seating > numberOfSeats) {
            System.out.println ("количество свободных сидячих мест в вагоне  "  + numberOfSeats + " из 60 рассчитанных мест ");
        }
        if(standingRoom > standingOccupancy){
            System.out.println("количество свободных стоячих мест в вагоне " + numberOfStandingPlaces + " из 42 расчетных мест ");
        }
        if (oneWagon > totalFrePlaces) {
            System.out.println("общее количество свободных мест в одном вагоне осталось для " + totalFrePlaces + " человек");
        }


        // Условный оператор else
        System.out.println("Условный оператор else");

        // Задание 1.
        int age_1 = 18;
        if (18 > age_1){
            System.out.println("больше " + age_1);
        } else if (18 < age_1) {
            System.out.println("меньше " + age_1);
        }
         else {
            System.out.println("равно " + 18);
        }
         // Задание 2.
        int baby =7;
         if (8 > baby) {
             System.out.println("ребенок ходит в школу т.к его возраст более " + baby + " лет");
         } else{
             System.out.println("ребенок ходит в школу т.к ему ровно " + baby + " лет");
         }

         int manStudent = 24;
         if (24 <= manStudent) {
             System.out.println("человек в " + manStudent + " года окончил университет и ему пора искать работу ");
         }else{
             System.out.println("человеку больше " + manStudent + " лет, ему необходимо найти работу");
         }
         // Задание 3.
        byte oneWagon_1 = 102; // вместимомть одного вагона
        byte seating_1 = 60; // рассчитан на 60 сидячих мест
        byte seatingLoad_1 = 59; // загруженность сидячих
        int numberOfSeats_1 = seating_1 - seatingLoad_1; // количество сидячих мест
        int standingRoom_1 = oneWagon_1 - seating_1; // расчитан на 42 стоячих места
        int standingOccupancy_1 = 40; // загруженность стоячих
        int numberOfStandingPlaces_1 = standingRoom_1 - standingOccupancy_1; // количество стоячих мест
        int totalFrePlaces_1 = numberOfSeats_1 + numberOfStandingPlaces_1; // всего свободных мест (стоячие +исидячие)
        if(seatingLoad_1 < seating_1 && standingRoom_1 > standingOccupancy_1 && totalFrePlaces_1 < oneWagon_1) {
            System.out.println("количество свободных сидячих мест " + numberOfSeats_1 + " ,количество свободных стоячих мест " + numberOfStandingPlaces_1 + " , осталось всего свободных мест для " + totalFrePlaces_1 + " человек");
        }
        else {
            System.out.println("Вагон полностью загружен");
        }

        // Операции && ; || (И ; ИЛИ)

        // Задание 1.
        int years = 6;
        boolean kindergarten = 2 < years || years < 2;
        if(kindergarten) {
            System.out.println("если возраст человека равен 2 годам и не превысел " + years + " лет, то ему нужно ходить в детский сад\"");
        }
        int years_1 = 18;
        boolean school = 7 < years_1;
        if(school) {
            System.out.println("если возраст человека равен 7 годам и не превысел " + years_1 + " лет, то ему нужно ходить в школу");
        }
        int manMore = 18;
        int manLess = 24;
        boolean university = manMore > 17 && manLess > 22;
        if(university) {
            System.out.println("если возраст человека больше " + manMore + " лет но не меньше " + manLess + " лет, то его место в университете");
        }
        int manMore_1 = 24;
        boolean toWork = manMore_1 < 25;
        if (toWork) {
            System.out.println("если возраст человека > " + manMore_1 + " ,то ему пора ходить на работу");
        }
        // Задание 2.
        int less = 5;
        boolean cantRide = less < 6;
        if(cantRide) {
            System.out.println("ребенок не может кататься один");
        }
        int more = 5;
        int butLess = 14;
        boolean canRide = more > 4 && more < butLess;
        if(canRide) {
            System.out.println("может кататься");
        }
        else {
            System.out.println("если взрослого нет, то кататься не льзя");
        }
        int older = 14;
        boolean unaccompaniedByAnAdult = older < 18;
        if(unaccompaniedByAnAdult) {
            System.out.println("может кататься без сопровождения взрослого");
        }
        // Задание 3.
        int one = 1;
        int two = 2;
        int free = 3; // Меняем СаМоЕ Большое ЧИСЛО и смотрим результат в консоли.
        boolean otf = free < one || free > two;
        if(otf) {
            System.out.println(free + " самое большое число из представленных чисел");
        }
        else if (two <= free) {
            System.out.println(two + " среднее число из представленных чисел");
        }
        else {
            System.out.println(one + " самое маленькое число из представленных чисел");
        }

















    }
}