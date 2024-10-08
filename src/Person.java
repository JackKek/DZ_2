class Сотрудник
{
    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private double зарплата;
    private int возраст;

    // Конструктор
    Сотрудник(String ФИО, String должность, String email, String телефон, double зарплата, int возраст)
    {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    // Метод для вывода информации об объекте в консоль
    void outInformation()
    {
        System.out.println("ФИО: " + ФИО);
        System.out.println("Должность: " + должность);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + телефон);
        System.out.println("Зарплата: " + зарплата);
        System.out.println("Возраст: " + возраст);
    }
}
