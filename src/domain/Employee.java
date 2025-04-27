package domain;
/**
 * Базовий клас, що представляє співробітника компанії.
 */
public class Employee {
    /**
     * Повертає рядкове представлення об'єкта Employee.
     * @return Інформація про співробітника.
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;
    /**
     * Конструктор з параметрами.
     * @param name Ім'я співробітника.
     * @param jobTitle Посада співробітника.
     * @param level Рівень співробітника (1–3).
     * @param dept Відділ співробітника.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Конструктор за замовчуванням. Генерує випадковий ID співробітника.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
    }
    /**
     * Встановлює посаду співробітника.
     * @param job Нова посада.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Повертає посаду співробітника.
     * @return Посада співробітника.
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Повертає ім'я співробітника.
     * @return Ім'я співробітника.
     */
    public String getName() {
        return name;
    }
    /**
     * Встановлює рівень співробітника.
     * @param level Рівень (1–3).
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Повертає рівень співробітника.
     * @return Рівень співробітника.
     */
    public int getLevel() {
        return level;
    }
    /**
     * Повертає відділ співробітника.
     * @return Назва відділу.
     */
    public String getDept() {
        return dept;
    }
    /**
     * Встановлює відділ співробітника.
     * @param dept Назва відділу.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * Встановлює ім'я співробітника після перевірки правильності.
     * @param name Ім'я співробітника.
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
