package ua.ithillel.homework6;

/**
 * GIT Stash example:
 * сперва создал класс, спрятал изменения при помощи команды git stash save CheckTimeClass, дорабатывая другое задание
 * просмотрел список всех спрятанных изменений при помощи команды git stash list и восстановил с удалением
 * спрятанных изменений ранее используя git stash pop с индексом нужной доработки.
 *
 */

public class CheckTime {
    private static final String TODAY = "TODAY IS: ";

    public static void main(String[] args) {
        System.out.println(TODAY + java.time.LocalDateTime.now());
    }
}
