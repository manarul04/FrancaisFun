package com.manastudio.myapplication.materi2;

public class SoalQuizHelper2 {
    private String[] mSoal = {
        "Qui est Laure ?",//1
        "Laura est …",//2
        "De quelle couleur sont les cheveux de Laura ?",//3
        "Laura est …",//4
        "Laura est …",//5
        "De quelle couleur sont les yeux de Laura ?",//6
        "Laure est gentille. Quel est l’anonyme de “gentille” ?",//7
        "Laura est généreuse. Le synonyme de “généreuse ” est ...",//8
        "Laura est …",//9
        "Quel est l'antonyme de “riche”?"//10
};

        private String[][] mChoices = {
                {"La cousine de Catherine", "La mère de Paul", "L'amie de Catherine"},//1
                {"Belle","Beau","Moche"},//2
                {"Noirs", "Blanches", "Blonds"},//3
                {"Grande", "Carlin", "Pointu"},//4
                {"Petite", "Mince", "Vieille"},//5
                {"Blanches", "Rouges", "Bleus"},//6
                {"Méchant", "Timide", "Intelligent "},//7
                {"Intelligent", "Philanthrope", "Timide"},//8
                {"Riche", "Méchant", "L’hôpital"},//9
                {"Egoïste", "Patient ", "Pauvre"}//10
        };


        private String[] mCorrectAnswers = {
                "L'amie de Catherine",//1
                "Belle",//2
                "Blonds",//3
                "Pointu",//4
                "Mince",//5
                "Bleus",//6
                "Méchant",//7
                "Philanthrope",//8
                "Riche",//9
                "Pauvre"//10

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
