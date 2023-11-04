class StudentStatistics {
    public static void main(String[] args) {
        // Step 1: Define the input data
        String studentData = "Zul:85, Raza:92, Hamad:78, Kami:95, Dawood:88, Hassan:79, Mohsin:90";

        // Step 2: Split the input string into individual student records
        String[] records = studentData.split(", ");

        // Initialize variables to store statistics
        int total = records.length;
        int totalScore = 0;
        int highestScore = 0;
        String highestScorer = "";
        int lowestScore = Integer.MAX_VALUE;
        String lowestScorer = "";

        // Step 3: Process each student record
        for (String record : records) {
            // Split each record into name and score
            String[] parts = record.split(":");
            String name = parts[0];
            int score = Integer.parseInt(parts[1]);

            // Calculate the total score
            totalScore += score;

            // Update highest score and scorer if needed
            if (score > highestScore) {
                highestScore = score;
                highestScorer = name;
            }

            // Update lowest score and scorer if needed
            if (score < lowestScore) {
                lowestScore = score;
                lowestScorer = name;
            }
        }

        // Calculate the average score
        double averageScore = (double) totalScore / total;

        // Step 4: Display the statistics
        System.out.println("Total students: " + total);
        System.out.println("Average score: " + averageScore);
        System.out.println("Highest score: " + highestScore + " by " + highestScorer);
        System.out.println("Lowest score: " + lowestScore + " by " + lowestScorer);
    }
}
