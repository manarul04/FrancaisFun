package com.manastudio.myapplication.materi3;

public class SoalQuizHelper3 {
    private String[] mSoal = {
        "Le sac est … la chaise et le lit.",//1
        "La bouteille est … la table.",//2
        "De quelle couleur sont les cheveux de Laura ?",//3
        "Sur la table, à gauche de la chaise, il y a …",//4
        "Près de la fenêtre il y a …",//5
        "Les livres sont … de la fenêtre.",//6
        "Entre les livres et la télévision il y a ...",//7
        "La chaise est … le sac.",//8
        "Sous la bouteille il y a …",//9
        "Le pot est …  la télévision."//10
};

        private String[][] mChoices = {
                {"à gauche", "à droite", "entre"},//1
                {"sur","sous","devant"},//2
                {"sous","sur", "près de"},//3
                {"un sac", "l’ordinateur", "un lit"},//4
                {"un lit", "un sac", "une bouteille"},//5
                {"sur","sous","à gauche"},//6
                {"un sac", "une bouteille", "une fenêtre"},//7
                {"sur","devant","sous"},//8
                {"une table", "une chaise", "un lit"},//9
                {"sous","sur", "près de"}//10
        };


        private String[] mCorrectAnswers = {
                "entre",//1
                "sur",//2
                "près de",//3
                "l’ordinateur",//4
                "un lit",//5
                "à gauche",//6
                "une fenêtre",//7
                "devant",//8
                "une table",//9
                "près de"//10

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
