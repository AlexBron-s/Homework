import java.util.Random;

public class Main {
    //1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
    //классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
    //консоль).
    //2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
    //должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
    //печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    //3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
    //этот набор препятствий.
    //4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
    //на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
    //препятствий не идет.
    public static void main(String[] args) {
        Members[] members = randomMembers(10);
        Obstacles[] obstacles = randomObstacles(4);
        for (Members member : members) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j].getClass() == RunningTrack.class) {
                    if (Boolean.FALSE.equals(member.run((RunningTrack) obstacles[j]))) {
                        j = obstacles.length;
                    }
                } else {
                    if (Boolean.FALSE.equals(member.jump((Wall) obstacles[j]))) {
                        j = obstacles.length;
                    }
                }
            }
        }
    }
    private static Members[] randomMembers(int length) {
        System.out.println("Участников: " + length);
        Random random = new Random();
        Members[] members = new Members[length];
        for (int i = 0; i < members.length; i++) {
            int r = random.nextInt(3);
            if (r == 2) {
                members[i] = new Human(i, random.nextInt(6), random.nextInt(6));
            } if (r == 1) {
                members[i] = new Cat(i, random.nextInt(6), random.nextInt(6));
            } if (r == 0) {
                members[i] = new Robot(i, random.nextInt(6), random.nextInt(6));
            }
        }
        return members;
    }
    private static Obstacles[] randomObstacles(int length) {
        System.out.println("Препятствий: " + length);
        Random random = new Random();
        Obstacles[] obstacles = new Obstacles[length];
        for (int i = 0; i < obstacles.length; i++) {
            int r = random.nextInt(2);
            if (r == 1) {
                obstacles[i] = new RunningTrack(random.nextInt(6));
            } if (r == 0) {
                obstacles[i] = new Wall(random.nextInt(6));
            }
        }
        return obstacles;
    }
}
