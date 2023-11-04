public interface Serviced {

    void check();

    default void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.check();
    }

}
