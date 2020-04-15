package se.lexicon;


public class App 
{
    public static void main( String[] args )
    {
        String lyrics = "Uryyb qnexarff, zl byq sevraq\n" +
                "V'ir pbzr gb gnyx jvgu lbh ntnva\n" +
                "Orpnhfr n ivfvba fbsgyl perrcvat\n" +
                "Yrsg vgf frrqf juvyr V jnf fyrrcvat\n" +
                "Naq gur ivfvba gung jnf cynagrq va zl oenva\n" +
                "Fgvyy erznvaf\n" +
                "Jvguva gur fbhaq bs fvyrapr\n" +
                "\n" +
                "Va erfgyrff qernzf V jnyxrq nybar\n" +
                "Aneebj fgerrgf bs pbooyrfgbar\n" +
                "'Arngu gur unyb bs n fgerrg ynzc\n" +
                "V ghearq zl pbyyne gb gur pbyq naq qnzc\n" +
                "Jura zl rlrf jrer fgnoorq ol gur synfu bs n arba yvtug\n" +
                "Gung fcyvg gur avtug\n" +
                "Naq gbhpurq gur fbhaq bs fvyrapr\n" +
                "\n" +
                "Naq va gur anxrq yvtug V fnj\n" +
                "Gra gubhfnaq crbcyr, znlor zber\n" +
                "Crbcyr gnyxvat jvgubhg fcrnxvat\n" +
                "Crbcyr urnevat jvgubhg yvfgravat\n" +
                "Crbcyr jevgvat fbatf gung ibvprf arire funer\n" +
                "Ab bar qnerq\n" +
                "Qvfgheo gur fbhaq bs fvyrapr\n" +
                "\n" +
                "\"Sbbyf\" fnvq V, \"Lbh qb abg xabj\n" +
                "Fvyrapr yvxr n pnapre tebjf\n" +
                "Urne zl jbeqf gung V zvtug grnpu lbh\n" +
                "Gnxr zl nezf gung V zvtug ernpu lbh\"\n" +
                "Ohg zl jbeqf yvxr fvyrag envaqebcf sryy\n" +
                "Naq rpubrq va gur jryyf bs fvyrapr\n" +
                "\n" +
                "Naq gur crbcyr objrq naq cenlrq\n" +
                "Gb gur arba tbq gurl znqr\n" +
                "Naq gur fvta synfurq bhg vgf jneavat\n" +
                "Va gur jbeqf gung vg jnf sbezvat\n" +
                "\n" +
                "Naq gur fvta fnvq, \"Gur jbeqf bs gur cebcurgf\n" +
                "Ner jevggra ba gur fhojnl jnyyf\n" +
                "Naq grarzrag unyyf\n" +
                "Naq juvfcrerq va gur fbhaqf bs fvyrapr\n" +
                "\n";


        System.out.println(Rot13Converter.convertText(lyrics));

    }
}
