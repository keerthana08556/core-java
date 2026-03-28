class AmazonRunner {

    public static void main(String[] args) {

        String user1 = Amazon.validateAndCreateAccount("chethana N",7795123462L,"chethu@gmail.com","chethu@123");
        System.out.println(user1);

        String user2 = Amazon.validateAndCreateAccount("Keerthana N",7892694083L,"keerthi@gmail.com","keeru@123");
        System.out.println(user2);
    }
}