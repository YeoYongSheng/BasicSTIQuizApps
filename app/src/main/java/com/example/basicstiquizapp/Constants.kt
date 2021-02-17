package com.example.basicstiquizapp

object Constants {
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList =ArrayList<Question>()
        val que1= Question (1,
                            "The main policy goal for The new Science, Technology and Innovation Policy (STI) is:", R.drawable.a,
                            "SRISHTI is the main policy goal to led path for India.",
                            "To translate this action into vision.",
                            "A dedicated Policy Research Cell is yet to establish.",
                            "All of the above.",
                            1
            )

        questionsList.add(que1)
        val que2= Question (2,
            "What is Women Scientists Scheme?",
            R.drawable.b,
            "It aims to provide Women scientists for pursuing research in engineering only.",
            "It aims to provide Women Scientists for pursuing research in applied sciences only.",
            "All of the above.",
            "None of the above.",
            3
        )

        questionsList.add(que2)

        val que3= Question (3,
                "Name an umbrella programme that was launched in 2007 to promote R & D?", R.drawable.c,
                "Creating and Nurturing S & T Human Resource",
                "Nano Science & Technology",
                "Scientific Excellence",
                "International S & T cooperation",
                2
        )

        questionsList.add(que3)
        val que4= Question (4,
                "What are the main objectives of Nano Science and Technology:",
                R.drawable.d,
                "Human Resource Development",
                "International collaboration and orchestrating national dialogues",
                "All of the above.",
                "None of the above",
                3
        )

        questionsList.add(que4)

        val que5= Question (5,
                "The Department of Scientific and Industrial Research (DSIR) was set up in:",
                R.drawable.e,
                "1982","1983","1984","1985",
                4
        )

        questionsList.add(que5)
        val que6= Question (6,
                "Department of Science and Technology devoted its attention in various domains they are:",
                R.drawable.e,
                "Support for the establishment of multi-stakeholder mechanisms for partnerships for promoting Science.",
                "Deploys Technology through national missions.*",
                "Does not provide evidences based policy formulation for S&T sector.*",
                "Nurtures R & D institutions and building infrastructural facilities.",
                3
        )

        questionsList.add(que6)

        val que7= Question (7,
                "Under the Ministry of Science and Technology, The Survey of India (SOI) was set up in:",
                R.drawable.g,
                "1767","1757","1777","1787",
                1
        )

        questionsList.add(que7)
        val que8= Question (8,
                "Survey Training Institute, Hyderabad established under:",
                R.drawable.h,
                "UNDP","SOI","STI","NNRMS",
                1
        )

        questionsList.add(que8)

        val que9= Question (9,
                "Ball-Point pen is invented by:", R.drawable.i,
                "Waterman","Oscar","Wilson","Lazlo Biro",
                4
        )

        questionsList.add(que9)
        val que10= Question (10,
                " Logarithm tables were invented by:",
                R.drawable.j,
                "J.J. Thompson","John Napier","Paul Ehrlich","A.G. Bell",
                4
        )

        questionsList.add(que10)

        val que11= Question (11,
                "Who had invented zero?", R.drawable.k,
                "Egyptians","Greeks","Indians","None of the above",
                3
        )

        questionsList.add(que11)
        val que12= Question (12,
                " Name the physicist who is credited with the discovery of the Neutron. This 1932 discovery led to his winning the Nobel Prize.",
                R.drawable.l,
                "Max Plank"," J.S. Fleming","Enrico Fermi","James Chadwick",
                4
        )

        questionsList.add(que12)

        val que13= Question (13,
                "Which of the following network protocols is described by GSM",
                R.drawable.m,
                "2G","3G","4G","5G",
                1
        )

        questionsList.add(que13)
        val que14= Question (14,
                "Oncology is the study of -",
                R.drawable.n,
                "Birds","Cancer","Mammals","Soil",
                2
        )

        questionsList.add(que14)

        val que15= Question (15,
                "The experiment will employ a trio of spacecraft flying in formation in the shape of an equilateral triangle that has sides one million kilometers long, with lasers shining between the craft. The experiment in question refers to -",
                R.drawable.o,
                "Voyager-2","New Horizons"," LISA Pathfinder","Evolved LISA",
                3
        )

        questionsList.add(que15)
        val que16= Question (16,
                "Which was the first Internet service in India?",
                R.drawable.p,
                "Advanced Research Projects Agency Network","Education and Research Network","INDNET","HINDNET",
                2
        )

        questionsList.add(que16)

        val que17= Question (17,
                "The inventor of printing press was -",
                R.drawable.q,
                "B. P. Singh","Karl Mobius","Sir A. G. Tansley","Walter G. Rosen",
                4
        )

        questionsList.add(que17)
        val que18= Question (18,
                "Who coined the term Biodiversity?",
                R.drawable.r,
                "Marshall McLuhan","Ts' ai Lun","Johann Guttenberg","Frederic Barbier",
                3
        )

        questionsList.add(que18)

        val que19= Question (19,
                "You buy a bottle of packed water on a street and end up emptying the bottle. What will you do?",
                R.drawable.s,
                "Will keep the bottle and dispose in a garbage bin",
                "Will throw it as you go along",
                "Will throw it in a drain",
                "Will find a dirty place and throw it there",
                1
        )

        questionsList.add(que19)
        val que20= Question (20,
                "Energy conservation is very important today because -",
                R.drawable.t,
                "Sources of conventional energy are fast debleting",
                "Electrical energy has become more expensive",
                "Electrical energy consumption is increasing",
                "None of the above",
                1
        )

        questionsList.add(que20)

        val que21= Question (21,
                "Which one of the following is known as Earth Summit?",
                R.drawable.u,
                "United Nations Framework Convention on Climate change",
                "United Nations Conference on Environment and Development",
                "Convention on Biological Diversity",
                "None of the above",
                2
        )

        questionsList.add(que21)
        val que22= Question (22,
                "First World climate conference was organised in -",
                R.drawable.v,
                "1978 in Geneva","1979 in Geneva","1980 in Geneva","1977 in Geneva",
                2
        )

        questionsList.add(que22)

        val que23= Question (23,
                "Which of the following gas has highest contribution in global warming?",
                R.drawable.w,
                "Carbon-di-oxide","Chlorofluorocarbon","Nitro us oxide","Methane",
                1
        )

        questionsList.add(que23)
        val que24= Question (24,
                "Who was the father of Indian Space Programme?",
                R.drawable.x,
                "Dr. Vikram Ambalal Sarabhai",
                "Dr. Satish Dhawan","Dr. Homi J. Bhabha","Dr. Krishnaswami Kasturirangan",
                1
        )

        questionsList.add(que24)

        val que25= Question (25,
                "Which of the following is Academic Institute Satellite?", R.drawable.y,
                "CARTOSAT-2B","KALPANA-1","INSAT-2E","SATYABAMASAT",
                4
        )

        questionsList.add(que25)






        return questionsList
}

}