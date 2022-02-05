package com.manastudio.myapplication.materi1;

public class SoalQuizHelper1 {
    private String[] mSoal = {
        "Qu'est-ce que ç'est ?",//1
        "Où est l'image du sac ?",//2
        "Catherine n'aime pas le modèle de ses chaussures. Où est l'image de ses chaussures ?",//3
        "C’est la nourriture que va acheter de Catherine . Qu'est-ce que ç'est ?",//4
        "Quelle nourriture que va acheter de Catherine ?",//5
        "C'est quel fruit ?",//6
        "C'est une boisson pour Paul. Qu'est-ce que ç'est ?",//7
        "Qu'est-ce que ç'est ?",//8
        "Synonymes du mot \n \"chez lui\"",//9
        "Laura et Catherine font leurs courses …"//10
};

        private String[][] mChoices = {
                {"La robe", "Le pantalon", "Les chaussures"},//1
                {"A","B","C"},//2
                {"A", "B", "C"},//3
                {"Du sucre", "Du pain", "Du Chocolat"},//4
                {"Des fruits", "Du sucre", "Du chocolat"},//5
                {"Des vins", "Un avocat", "Une pomme"},//6
                {"De la bière", "De l’eau", "Du lait"},//7
                {"L’aéroport", "L’hôpital", "La gare"},//8
                {"Sa maison", "L’aéroport", "L’hôpital"},//9
                {"au supermarché", "au cinéma", "à l'aéroport"}//10
        };


        private String[] mCorrectAnswers = {
                "La robe",//1
                "A",//2
                "C",//3
                "Du pain",//4
                "Des fruits",//5
                "Une pomme",//6
                "Du lait",//7
                "L’hôpital",//8
                "Sa maison",//9
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
