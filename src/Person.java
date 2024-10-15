class Persona
{
    private String FIO;
    private String post;
    private String email;
    private String mobile;
    private double salary;
    private int age;

    // Конструктор
    Persona (String ФИО, String должность, String email, String телефон, double зарплата, int возраст)
    {
        this.FIO = ФИО;
        this.post = должность;
        this.email = email;
        this.mobile = телефон;
        this.salary = зарплата;
        this.age = возраст;
    }

    // Метод для вывода информации об объекте в консоль
    void outInformation()
    {
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + mobile);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
