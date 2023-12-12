package exercise;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        var dlina = array.length;
        var shirina = array[0].length;
        String[][] changedArray = new String[dlina * 2][shirina * 2];
        for (int i = 0; i < dlina; i++) {
            for (int j = 0; j < shirina; j++) {
                changedArray[i * 2][j * 2] = array[i][j];
                changedArray[i * 2][j * 2 + 1] = array[i][j];
                changedArray[i * 2 + 1][j * 2] = array[i][j];
                changedArray[i * 2 + 1][j * 2 + 1] = array[i][j];
            }
        }
        return changedArray;
    }
}
