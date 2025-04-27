package domain;

/**
 * Клас, що представляє менеджера, який є співробітником і керує іншими співробітниками.
 */
public class Manager extends Employee {

    /**
     * Конструктор з повною ініціалізацією.
     * @param employees Масив співробітників, якими управляє менеджер.
     * @param name Ім'я співробітника.
     * @param jobTitle Посада співробітника.
     * @param level Рівень співробітника.
     * @param dept Відділ співробітника.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення об'єкта Manager.
     * @return Інформація про менеджера та співробітників, якими він керує.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Конструктор з масивом співробітників.
     * @param employees Масив співробітників.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор за замовчуванням.
     * Створює порожній масив для співробітників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає список співробітників.
     * @return Список імен співробітників.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив співробітників.
     * @param employees Масив співробітників.
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив співробітників.
     * @return Масив співробітників.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
