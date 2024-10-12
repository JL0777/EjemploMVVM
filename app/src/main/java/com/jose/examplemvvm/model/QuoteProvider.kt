package com.jose.examplemvvm.model

class QuoteProvider {
    companion object {


        fun random():QuoteModel{
            val position = (0..10).random()
            return quote[position]
        }

        val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Todo lo que escuchamos es solo una opinión, no un hecho. Lo que vemos es una perspectiva, no la realidad.",
                author = "Marco Aurelio"
            ),
            QuoteModel(
                quote = "Eres un alma pequeña que lleva un cadáver.",
                author = "Epicteto"
            ),
            QuoteModel(
                quote = "Primero aprende el significado de lo que dices y luego habla.",
                author = "Epicteto"
            ),
            QuoteModel(
                quote = "Tienes poder sobre tu mente, no en eventos externos. Date cuenta de esto y encontrarás fuerza.",
                author = "Marco Aurelio"
            ),
            QuoteModel(
                quote = "Si no está bien, no lo hagas, si no es verdad, no lo digas.",
                author = "Marco Aurelio"
            ),
            QuoteModel(
                quote = "No nos atrevemos a muchas cosas porque son difíciles, pero son difíciles porque no nos atrevemos a hacerlas.",
                author = "Séneca"
            ),
            QuoteModel(
                quote = "Te conviertes en lo que le das a tu atención.",
                author = "Epicteto"
            ),
            QuoteModel(quote = "Me río de los que piensan que pueden dañarme. No saben quién soy, no saben lo que pienso, ni siquiera pueden tocar las cosas que son realmente mías y con las que vivo. ", author = "Epicteto"),
            QuoteModel(quote = "Que no te arrastren los accidentes exteriores; procúrate tiempo libre para aprender algo bueno y cesa ya de girar como un trompo.", author = "Marco Aurelio"),
            QuoteModel(
                quote = "El autocontrol es la fuerza. El pensamiento correcto es dominio. La calma es poder.",
                author = "James Allen"
            ),
            QuoteModel(quote = "Ningún mal es honorable, pero la muerte es honorable, por lo tanto, la muerte no es malvada.", author = "Zenón de Citio")


        )
    }

}