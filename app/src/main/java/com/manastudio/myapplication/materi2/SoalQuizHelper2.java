package com.manastudio.myapplication.materi2;

public class SoalQuizHelper2 {
    private String[] mSoal = {
        "Qui est Laure ?",//1
        "Laura est …",//2
        "De quelle couleur sont les cheveux de Laura ?",//3
        "Laura a le nez …",//4
        "Laura est …",//5
        "De quelle couleur sont les yeux de Laura ?",//6
        "Laure est gentille. Quel est l’anonyme de “gentille” ?",//7
        "Où habitent Catherine et Laura ? ",//8
        "L'appartement de Catherine et Laura est sympa. L’anonyme du mot \"sympa\" est...",//9
        "L'appartement de Catherine et Laura est cher. Le synonyme du mot \"cher\" est..."//10
};

        private String[][] mChoices = {
                {"La cousine de Catherine", "La mère de Paul", "L'amie de Catherine"},//1
                {"Belle","Beau","Moche"},//2
                {"Noirs", "Blanches", "Blonds"},//3
                {"Grande", "Carlin", "Pointu"},//4
                {"Petite", "Mince", "Vieille"},//5
                {"Blanches", "Rouges", "Bleus"},//6
                {"Méchant", "Timide", "Intelligent "},//7
                {"Dans le bureau ", "À la maison  ", "Dans l’appartement"},//8
                {"Agréable", "Laid", "Sale"},//9
                {"Sale", "Coûteux", "Nettoyer "}//10
        };


        private String[] mCorrectAnswers = {
                "L'amie de Catherine",//1
                "Belle",//2
                "Blonds",//3
                "Pointu",//4
                "Mince",//5
                "Bleus",//6
                "Méchant",//7
                "Dans l’appartement",//8
                "Laid",//9
                "Coûteux"//10

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
