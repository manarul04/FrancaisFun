package com.manastudio.myapplication.materi1;

public class SoalQuizHelper1 {
    private String[] mSoal = {
        "Qu'est-ce que ç'est ?",//1
        "Quel est l'image d'un sac ?",//2
        "Catherine n'aime pas le modèle de ces chaussures. Où est l'image de ces chaussures ?",//3
        "Catherine va acheter cette nourriture. Qu'est-ce que ç'est ?",//4
        "Catherine va acheter du lait, du pain, et... pour Paul",//5
         "Qu'est-ce que ç'est ?",//6
        "Paul est malade et il est soigner chez lui. Synonymes du mot \"chez lui\"",//7
        "La maison de Paul est près de la gare. \nMontrez l’image de la gare.",//8
        "La maison de Paul est à droite de la poste.\nMontrez l’image de la poste.",//9
        "Laura et Catherine font leurs courses …"//10
};

        private String[][] mChoices = {
                {"La robe", "Le pantalon", "Les chaussures"},//1
                {"A","B","C"},//2
                {"A", "B", "C"},//3
                {"Du sucre", "Du pain", "Du Chocolat"},//4
                {"Des fruits", "Le sucre", "Le chocolat"},//5
                {"L’aéroport", "L’hôpital", "La appartement"},//6
                {"Sa maison", "L’hôpital", "La appartement"},//7
                {"A", "B", "C"},//8
                {"A", "B", "C"},//9
                {"au supermarché", "au cinéma", "à la class"}//10
        };


        private String[] mCorrectAnswers = {
                "La robe",//1
                "A",//2
                "C",//3
                "Du pain",//4
                "Des fruits",//5
                "L’hôpital",//6
                "Sa maison",//7
                "B",//8
                "C",//9
                "au supermarché"//10

        };

        public String getQuestion(int a) {
            return mSoal[a];
        }

        public String getChoice1(int a) {
            return mChoices[a][0];
        }


        public String getChoice2(int a) {
            return mChoices[a][1];
        }

        public String getChoice3(int a) {
            return mChoices[a][2];
        }

        public String getCorrectAnswer(int a) {
            return mCorrectAnswers[a];
        }

        public int getQuestion() {
            return mSoal.length;
        }
}
