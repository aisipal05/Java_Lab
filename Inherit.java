
interface exam {

    float percent_cal(float a, float b);
}

class student {

    public float marks1, marks2;
    public String name, roll_no;

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll_no);
        System.out.println("Total Marks: " + marks1);
        System.out.println("Full Marks: " + marks2);

    }
}

class result extends student implements exam {

    public float percent_cal(float a, float b) {
        return (a / b) * 100;
    }

    public void display() {
        float per = percent_cal(marks1, marks2);
        System.out.println("Percentage: " + per);
    }
}

public class Main {

    public static void main(String[] args) {
        result obj = new result();
        obj.name = "Tanmoy Das";
        obj.roll_no = "A91005224203";
        obj.marks1 = 232;
        obj.marks2 = 300;
        obj.show();
        obj.display();

    }
}
