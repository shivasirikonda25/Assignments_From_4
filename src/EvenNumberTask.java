class EvenNumberTask implements Runnable {
    private final NumberPrinter printer;

    public EvenNumberTask(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printer.printEvenNumber();
        }
    }
}
