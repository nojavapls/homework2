public class task8 {
    public static void main(String[] args) {
        var workingHours = 640;
        var hours = 8;
        System.out.println("Всего работников в компании – " + workingHours / hours + " человек" );
        var moreWorkers = 94;
        System.out.println("Если в компании работает  " + (workingHours / hours + moreWorkers ) + " человек, то всего " +  (workingHours / hours + moreWorkers )* hours + " часов работы может быть поделено между сотрудниками");
    }
}
