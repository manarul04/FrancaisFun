package com.manastudio.myapplication.materi1;

public class SoalQuizHelper1 {
    private String[] mSoal = {
        "Qu'est-ce que ç'est ?",//1
        "Où est l'image du sac ?",//2
        "Catherine n'aime pas le modèle de ses chaussures. Où est l'image de ses chaussures ?",//3
        "Catherine va acheter cette nourriture. Qu'est-ce que ç'est ?",//4
        "Catherine va acheter cette nourriture. Qu'est-ce que ç'est ?",//5
        "Paul aime ce fruit. Quel le nom de ce fruit ?",//6
        "Catherine achète cette boisson pour Paul. Qu'est-ce que ç'est ?",//7
        "Qu'est-ce que ç'est ?",//8
        "Paul est malade et il est soigner à chez lui. Synonymes du mot \"chez lui\"",//9
        "Laura et Catherine font leurs courses …"//10
};

        private String[][] mChoices = {
                {"La robe", "Le pantalon", "Les chaussures"},//1
                {"A","B","C"},//2
                {"A", "B", "C"},//3
                {"Le sucre", "Le pain", "Le Chocolat"},//4
                {"Des fruits", "Le sucre", "Le chocolat"},//5
                {"Un raisin", "Un avocat", "Une pomme"},//6
                {"De la bière", "De l’eau", "Du lait"},//7
                {"L’aéroport", "L’hôpital", "La gare"},//8
                {"Sa maison", "L’aéroport", "L’hôpital"},//9
                {"au supermarché", "au cinéma", "à l'aéroport"}//10
        };


        private String[] mCorrectAnswers = {
                "La robe",//1
                "A",//2
                "C",//3
                "Le pain",//4
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
