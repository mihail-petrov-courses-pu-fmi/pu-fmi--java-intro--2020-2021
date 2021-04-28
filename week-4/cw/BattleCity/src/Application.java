import java.util.Scanner;

public class Application {

    public static void gameLoop(String[][] gameBoard) {

        // употреба на динамични методи
        // {ИМЕ НА ИНСТАНЦИЯ / ПРОМЕНЛИВА}.{ИМЕ НА МЕТОДА}
        System.out.println("Изберете посока: ");
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.nextLine();
        gameBoard = GameBoardManager.movePlayer(direction, gameBoard);
        GameBoardManager.renderGameBoard(gameBoard);

        gameLoop(gameBoard);
    }



    public static void main(String[] args) {

        // употреба на статичен метод. <=> път до метода
        // * {ИМЕ НА КЛАСА}.{ИМЕ НА МЕТОДА}
        String[][] gameBoard = GameBoardManager.bootstrapGameBoard();
        GameBoardManager.renderGameBoard(gameBoard);

//        while(true) {
//            // употреба на динамични методи
//            // {ИМЕ НА ИНСТАНЦИЯ / ПРОМЕНЛИВА}.{ИМЕ НА МЕТОДА}
//            System.out.println("Изберете посока: ");
//            Scanner scanner = new Scanner(System.in);
//            String direction = scanner.nextLine();
//            gameBoard = GameBoardManager.movePlayer(direction, gameBoard);
//            GameBoardManager.renderGameBoard(gameBoard);
//        }


        gameLoop(gameBoard);
    }
}