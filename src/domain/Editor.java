package domain;

/**
 * Клас, що представляє редактора, який є художником з додатковою характеристикою редагування.
 */
public class Editor extends Artist {

    /**
     * Конструктор з повною ініціалізацією.
     * @param electronicEditing Чи використовується електронне редагування.
     * @param skiils Масив навичок.
     * @param name Ім'я співробітника.
     * @param jobTitle Посада співробітника.
     * @param level Рівень співробітника.
     * @param dept Відділ співробітника.
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з електронним редагуванням та навичками.
     * @param electronicEditing Чи використовується електронне редагування.
     * @param skiils Масив навичок.
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з електронним редагуванням.
     *
     * @param electronicEditing Чи використовується електронне редагування.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення об'єкта Editor.
     * @return Інформація про редактора.
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає вподобання редагування.
     * @return {@code true} якщо електронне редагування, {@code false} якщо паперове.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює вподобання редагування.
     * @param electronic {@code true} для електронного редагування, {@code false} для паперового.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
