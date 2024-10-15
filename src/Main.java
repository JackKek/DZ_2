
public class Main {
    public static void main(String[] args) {

        Persona[] persArray = new Persona[5];
        persArray[0] = new Persona("Андреев Александр Игоревич", "Инженер АСУТП", "фтвкуум@mailbox.com", "892312312", 130000, 35);
        persArray[1] = new Persona("Петров Петр Петрович", "Бухгалтер", "petrov@example.com", "987654321", 75000, 35);
        persArray[2] = new Persona("Симонова Мария Ивановна", "Менеджер", "sidorova@example.com", "456789012", 60000, 40);
        persArray[3] = new Persona("Кузнецов Александр Сергеевич", "Директор", "kuznetsov@example.com", "321987654", 170000, 45);
        persArray[4] = new Persona("Смирнова Елена Николаевна", "Администратор", "smirnova@example.com", "789012345", 85000, 25);



        for (Persona employee : persArray) // Выводим информацию о всех сотрудниках
        {
            employee.outInformation();
            System.out.println();


            Persona person = new Persona("Сурков Евгений Вячеславович", "Инженер-Программист", "surkov@gmail.com", "+7(981)735-88-83", 150000.0, 25);
            employee.outInformation();
        }

Park.Attraction[] attractions =
{
        new Park.Attraction("Roller Coaster", "10:00 - 18:00", 15.00),
        new Park.Attraction("Ferris Wheel", "11:00 - 19:00", 10.00),
        new Park.Attraction("Haunted House", "12:00 - 20:00", 12.00)
};

            Park park = new Park("Funland", attractions);
            park.displayParkInfo();

    }
}



