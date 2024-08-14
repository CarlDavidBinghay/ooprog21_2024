class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(" ".repeat(7 - i) + "I".repeat(2 * i - 1));
        }
    }
}
