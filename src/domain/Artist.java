package domain;

/**
 * Клас, що представляє художника, який є співробітником і має певні навички.
 */
public class Artist extends Employee {

    /**
     * Конструктор з повною ініціалізацією.
     * @param skiils Масив навичок.
     * @param name Ім'я співробітника.
     * @param jobTitle Посада співробітника.
     * @param level Рівень співробітника.
     * @param dept Відділ співробітника.
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор з навичками.
     * @param skiils Масив навичок.
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор за замовчуванням.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкта Artist.
     * @return Інформація про художника.
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Повертає навички у вигляді одного рядка.
     * @return Список навичок через кому.
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив навичок.
     * @param skills Масив навичок.
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок.
     * @return Масив навичок.
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
