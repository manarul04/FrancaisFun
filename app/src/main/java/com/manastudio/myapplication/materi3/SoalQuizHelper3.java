package com.manastudio.myapplication.materi3;

public class SoalQuizHelper3 {
    private String[] mSoal = {
        "Le sac est … la chaise et le lit.",//1
        "La bouteille est … la table.",//2
        "La télévision est … la fenêtre.",//3
        "Sur la grande table, à gauche de la chaise, il y a …",//4
        "Près de la fenêtre il y a …",//5
        "Les livres sont … de la fenêtre.",//6
        "Entre la placard des livres et la table de l'ordinateur, il y a ...",//7
        "Le câble est … le pot ",//8
        "Sur la table il y a …",//9
        "Le pot est …  la télévision."//10
};

        private String[][] mChoices = {
                {"à gauche", "à droite", "entre"},//1
                {"sur","sous","devant"},//2
                {"sous","sur", "près de"},//3
                {"un sac", "l’ordinateur", "un lit"},//4
                {"un lit", "un sac", "une bouteille"},//5
                {"sur","sous","à gauche"},//6
                {"une lampe", "une bouteille", "une chaise"},//7
                {"à gauche ","derrière","à droit "},//8
                {"une bouteille", "une chaise", "un sac"},//9
                {"sous","sur", "près de"}//10
        };


        private String[] mCorrectAnswers = {
                "entre",//1
                "sur",//2
                "près de",//3
                "l’ordinateur",//4
                "un lit",//5
                "à gauche",//6
                "une lampe",//7
                "derrière",//8
                "une bouteille",//9
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
