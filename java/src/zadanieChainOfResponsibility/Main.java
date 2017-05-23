package zadanieChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Clerk clerk1 = new Clerk(10);
        Clerk clerk2 = new Clerk(15);
        Clerk clerk3 = new Clerk(20);

        clerk1.setSupervisor(clerk2);
        clerk2.setSupervisor(clerk3);
        clerk3.setSupervisor(director);

        Client client = new Client();
        client.setHandler(clerk1);

        int i =20;
        while(i-- > 0){
            client.generateRandomRequest();
        }
    }
}
