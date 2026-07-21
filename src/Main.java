public class Main {
    public static void main(String[] args) {
        // 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // 6
        var sportsman1 = 78.2;
        var sportsman2 = 82.7;
        System.out.println(sportsman1 + sportsman2);
        System.out.println(sportsman2 -  sportsman1);
        // 7
        System.out.println(sportsman2 % sportsman1);
        // 8
        var hours = 640;
        var hours_one_worker = 8;
        var ans1 = hours / hours_one_worker;
        System.out.println("Всего работников в компании — " + ans1 + " человек.");
        var ans2 = ans1 + 94;
        var ans3 = ans2 * hours_one_worker;
        System.out.println("Если в компании работает " + ans2 + " человек, то всего " + ans3 + " часов работы может быть поделено между сотрудниками.");
    }
}