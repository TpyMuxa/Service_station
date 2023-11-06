public interface HasTrack {

    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
