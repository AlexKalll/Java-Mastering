import java.util.HashMap;
import java.util.Map;

public class Translation2 {
    private Map<String, String> englishToAmharic;
    private Map<String, String> amharicToEnglish;
    private Map<String, String> englishDescriptions;
    private Map<String, String> amharicDescriptions;

    public Translation2() {
        englishToAmharic = new HashMap<>();
        amharicToEnglish = new HashMap<>();
        englishDescriptions = new HashMap<>();
        amharicDescriptions = new HashMap<>();

        // Initialize the dictionary
        initializeDictionary();
    }

    private void initializeDictionary() {
        addTranslation("apple", "ፖም", "A fruit that is usually red, green, or yellow", "እንደገና ቀይ፣ አረንጓዴ ወይም ቢጫ ፍራፍሬ");
        addTranslation("ant", "አንቲ", "A small insect that lives in colonies", "በኮሎንሲዎች ውስጥ የሚኖር ትንሽ ተንኞ");
        addTranslation("arm", "ክንድ", "A limb of the human body extending from the shoulder to the hand", "ከትከሻ እስከ እጅ የሚሄድ የሰው አካል");
        addTranslation("ask", "ጠይቅ", "To inquire or seek information", "መጠየቅ ወይም መረጃ መፈላለግ");
        addTranslation("air", "አየር", "The invisible gaseous substance surrounding the earth", "የምድርን የቆርጠው የእርስተ ንጥረ ነገር");
        addTranslation("angry", "ተቆጣ", "Feeling or showing strong annoyance", "ጠንካራ ቅላም መሰል ወይም ማሳየት");
        addTranslation("animal", "እንስሳ", "A living organism that feeds on organic matter", "በኦርጋኒክ ነገር ላይ የሚመገበው ተንኞ ነፍሳት");
        addTranslation("artist", "አርቲስት", "A person who creates art", "እንግዲህ የሚፈጥር ሰው");
        addTranslation("actor", "ተዋናይ", "A person who performs in plays, movies, or television shows", "በድርስ፣ በፊልም፣ ወይም በቴሌቪዥን ምእራፍ ውስጥ የሚተገኝ ሰው");
        addTranslation("avenue", "መንገድ", "A broad road in a town or city", "በከተማ ወይም በከተማ ውስጥ አሰላልላ መንገድ");
        addTranslation("banana", "ሙዝ", "A long, curved fruit with a yellow skin", "ረጅም እና ጥሬ ፍሬ ቢጫ ቆዳ ያለው");
        addTranslation("ball", "ኳስ", "A round object used in games and sports", "በጨዋታዎችና ስፖርቶች ውስጥ የሚጠቀም ቀስ ነገር");
        addTranslation("bed", "አልጋ", "A piece of furniture for sleep or rest", "ለእንቅልፍ ወይም ለእረፍት የሚጠቀም ዕቃ");
        addTranslation("book", "መጽሐፍ", "A set of written or printed pages, usually bound with a protective cover", "ተቀናሽ ወይም እንደገና የተጋጠምት ገጾች ስብስብ");
        addTranslation("bird", "ወፍ", "A warm-blooded egg-laying vertebrate animal distinguished by feathers", "በእንቅልፍ እና በትሩ፣ የተለየ መንጋው የሚያስቀምጥ ወፍ");
        addTranslation("bread", "ዳቦ", "A staple food prepared from a dough of flour and water", "ከዳቦ እና ከውሃ የተዘጋጀ እንቅልፍ ምግብ");
        addTranslation("blue", "ሰማያዊ", "The color of the clear sky", "የሰማይ ነጣ ቀለም");
        addTranslation("brother", "ወንድም", "A male sibling", "ወንድ ወንድም");
        addTranslation("butter", "ቅቤ", "A pale yellow edible fatty substance made by churning cream", "በጥሩ አበባ ስቦለት ከተሰራ እንቅልፍ የሚረጥብ ቢጫ የምግብ ቅቤ");
        addTranslation("baby", "ሕፃን", "A very young child", "በጣም ታናሽ ልጅ");
        addTranslation("cat", "ድመት", "A small domesticated carnivorous mammal", "ትንሽ የተሰወለ ሰው ተንሳፋፊ");
        addTranslation("car", "መኪና", "A road vehicle, typically with four wheels", "በአብዛኛው ከአራት መንኮሶች ያባበረ መንገድ ተሽከርካሪ");
        addTranslation("cup", "ኩባያ", "A small bowl-shaped container for drinking from", "ለመጠጣት የሚጠቀም ትንሽ እንደ ጡብ የተሰራ ዕቃ");
        addTranslation("cake", "ኬክ", "A sweet baked dessert", "ጣፋጭ የተጋጠም ጣፋጭ እንቅልፍ");
        addTranslation("city", "ከተማ", "A large town", "ትልቅ ከተማ");
        addTranslation("cold", "ቀዝቃዛ", "Of or at a low or relatively low temperature", "በትንሹ ወይም በአጠቃላይ በታች ታች የሚጠቅም ከላይ ታች ሙቀት");
        addTranslation("cow", "ላም", "A fully grown female animal of a domesticated breed of ox", "ከቤተሰብ እና ልደቱ የታደመ ሴት እንስሳ");
        addTranslation("chair", "ወንበር", "A separate seat for one person, typically with a back and four legs", "ለአንድ ሰው ብቻ የሚሠለጥን በተለምዶ በኋላና ከአራት እግሮች ያባበረ ዕቃ");
        addTranslation("child", "ልጅ", "A young human being below the age of puberty", "ከጉልበት ዓመት በታች የሚገኝ ታናሽ ሰው");
        addTranslation("clock", "ሰዓት", "A mechanical or electrical device for measuring time", "ለሰዓት መጠን ባለስማማት መሣሪያ");


        // D
        addTranslation("dog", "ውሻ", "A domesticated carnivorous mammal", "የቤት እና ሰው ተንሳፋፊ");
        addTranslation("door", "መዝጊያ", "A hinged, sliding, or revolving barrier", "በክንካፍ፣ በሰረገላ ወይም በንቁራት ያበራ ጉድጓድ");
        addTranslation("dance", "ወጣት", "To move rhythmically to music", "በሙዚቃ ላይ በቅኝት ማንቀላፋት");
        addTranslation("day", "ቀን", "A period of twenty-four hours", "ሃያአራት ሰዓታት ወቅት");
        addTranslation("drink", "መጠጣት", "To take liquid into the mouth and swallow", "መጠጥ ለመግባት እና ለመጠጣት");
        addTranslation("drive", "መንዳት", "To operate and control the direction of a vehicle", "በተሽከርካሪ ላይ አቅጣጫ ማስተካከል እና መቆጣጠር");
        addTranslation("desk", "ጠረጴዛ", "A piece of furniture with a flat top for writing or working on", "ለመጻፍ ወይም ለሥራ የተደረገ ትንሽ የስኳር ዕቃ");
        addTranslation("doctor", "ሐኪም", "A qualified practitioner of medicine", "የሕክምና ተግባር የሚከናውን የተማረ ሰው");
        addTranslation("dinner", "እራት", "The main meal of the day", "የቀኑ ዋና ምግብ");
        addTranslation("duck", "ጭማቂ", "A waterbird with a broad blunt bill", "ቆራጭ እና ሰፊ አፍ ያለው ውሃ ወፍ");
        addTranslation("egg", "እንቁላል", "An oval or round object laid by a female bird, reptile, fish, or invertebrate", "በወንበር እንዲሁም በወፍ ተናድ የተቀመጠ እንቁላል ነገር");
        addTranslation("ear", "ጆሮ", "The organ of hearing and balance in humans and other vertebrates", "በሰውና በሌሎች እንስሳት ውስጥ የምስማት እና የሚታሰሩበት አካል");
        addTranslation("eat", "መብላት", "To put food into the mouth, chew, and swallow it", "ምግብ ማንቀላፋት እና መጠጣት");
        addTranslation("elephant", "ዝሆን", "A large mammal with a trunk", "በትልቅ የሰረገላ ሰረገላ ያለው ትልቅ እንስሳ");
        addTranslation("eye", "አይን", "The organ of sight", "የስሜት አካል");
        addTranslation("earth", "መሬት", "The planet on which we live", "የእኛ ዓለም ፕላኔት");
        addTranslation("engine", "ሞተር", "A machine with moving parts that converts power into motion", "ኃይልን ወደ እንቅስቃሴ የሚቀይር ተንቀሳቃሽ ክፍሎች ያላቸው ማሽን");
        addTranslation("energy", "ኃይል", "The strength and vitality required for sustained physical or mental activity", "እንቅስቃሴን ለመጠበቅ የሚያስፈልጉት ኃይልና እንቅስቃሴ");
        addTranslation("fish", "አሳ", "A limbless cold-blooded vertebrate animal with gills", "እግሮች የሌላቸው በቀዝቃዛ ደም እና በሰማይ ያለው እንስሳ");
        addTranslation("flower", "አበባ", "The seed-bearing part of a plant", "የተከለ የተቀመጠ እና የተቀመጠ እንክብካቤ");
        addTranslation("fire", "እሳት", "Combustion or burning", "ድርሰት ወይም በሚቃጠልበት ነገር");
        addTranslation("friend", "ጓደኛ", "A person with whom one has a bond of mutual affection", "ከአንድ ሰው ጋር እንደ እንዳቀበል አንድ ትስስር ያላቸው");
        addTranslation("family", "ቤተሰብ", "A group of one or more parents and their children", "አንድ ወይም ከፍተኛ ቤተሰብ እና ልጆቻቸው ያላቸው አንድ ቡድን");
        addTranslation("fruit", "ፍራፍሬ", "The sweet and fleshy product of a tree or other plant that contains seed", "የተከለ የተከለ ፍራፍሬ የተቀመጠ እንክብካቤ የአበባ");
        addTranslation("foot", "እግር", "The lower extremity of the leg below the ankle", "ከእግር ትከሻ በታች የሚገኝ ወቅት");
        addTranslation("forest", "ደን", "A large area covered chiefly with trees and undergrowth", "በታላቅ መጠን በአንድ ውስጥ የተለየ ደን");
        addTranslation("frog", "ዳማ", "A tailless amphibian with a short squat body", "አነስተኛ የሚገኝ አንቀላፋ እና ትልቅ እንስሳ");
        addTranslation("food", "ምግብ", "Any nutritious substance that people or animals eat or drink", "ምንም እንደ ነፍሰ ትንሽ እንዳለ ነገር የሚጠቀም");
        addTranslation("hat", "ኮፍያ", "A shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform", "ለስር ቁመት የሚጠቀም የሚጠቀም የተሰራ ቆዳ ልብስ");
        addTranslation("house", "ቤት", "A building for human habitation, especially one that is lived in by a family or small group of people", "ለሰውነት የተሰራ እና በማንኛውም ቤተሰብ ወይም በትንሽ ቡድን ውስጥ የሚጠቀም");
        addTranslation("hand", "እጅ", "The end part of a person's arm beyond the wrist, including the palm, fingers, and thumb", "ከትከሻ በታች የሚገኝ እንክብካቤ እና ልጆች");
        addTranslation("heart", "ልብ", "A hollow muscular organ that pumps the blood through the circulatory system by rhythmic contraction and dilation", "በእልቅሽ ተልተልብ ያለ የምድር ተንቀሳቃሾች");

        addTranslation("horse", "ፈረስ", "A large plant-eating domesticated mammal with solid hoofs and a flowing mane and tail, used for riding, racing, and to carry and pull loads", "ታላቅ ተልባች ያለው ሰውነት እንስሳ");
        addTranslation("happy", "ደስታ", "Feeling or showing pleasure or contentment", "በቅድሚያ ደስታ አስተካካይ");
        addTranslation("hot", "ሙቀት", "Having a high degree of heat or a high temperature", "በከፍተኛ ሙቀት ያለ ወይም ሙቀት ያለው");
        addTranslation("help", "እርዳታ", "The action of helping someone to do something", "አንድ ሰውን ለማድረግ የሚረዳ");

        // I
        addTranslation("ice", "በረዶ", "Frozen water, a brittle, transparent crystalline solid", "የተረጠቀ ውሃ ነጠላ ውሃ");
        addTranslation("island", "ደሴት", "A piece of land surrounded by water", "በውሃ የተከበበ መሬት");
        addTranslation("idea", "ሐሳብ", "A thought or suggestion as to a possible course of action", "አንድ አንገብሮ ወይም ሐሳብ");
        addTranslation("insect", "አረር", "A small arthropod animal that has six legs and generally one or two pairs of wings", "በታናሽ እና በትንሽ አካል የተረጠቀ እንስሳ");
        addTranslation("ink", "ቀለም", "A colored fluid used for writing, drawing, or printing", "ለመጻፍ፣ ለማስየት ወይም ለመቅረፅ የሚረዳ ለለም ቀለም");
        addTranslation("iron", "ብረት", "A strong, hard magnetic silvery-gray metal", "በሀረር የሚታጠቅ የታችኛው ጥቁር ቅርብ አሳጣች");
        addTranslation("important", "አስፈላጊ", "Of great significance or value", "ከትልቅ ወቅት ወይም ከተለይቶ የተቀረጸ");
        addTranslation("interest", "ፍላጎት", "The state of wanting to know or learn about something", "ማንኛውንም ማውቀት ወይም መማር የሚረዳ ሁኔታ");
        addTranslation("ill", "በሽተኛ", "Not in good health; sick", "አለመታመን; በሽተኛ");
        addTranslation("imagine", "መሰለ", "To form a mental image or concept of something", "ማንኛውንም እንደሆነ አንድ ሃሳብ ወይም እንደሆነ እንደሆነ ማስረዳት");

        // J
        addTranslation("jacket", "ጃኬት", "A short coat", "እንደገና አስቸኳይ");
        addTranslation("jump", "ዘለለ", "To push oneself off a surface and into the air by using the muscles in one's legs and feet", "በሰው እግሮች እና እግሮች ስሜት ማቅረብ");
        addTranslation("jungle", "ጫካ", "An area of land overgrown with dense forest and tangled vegetation, typically in the tropics", "በከፍተኛ በእንክብካቤ የተረጠቀ በሽተኛ የተረጠቀ መሬት");
        addTranslation("job", "ሥራ", "A paid position of regular employment", "በተከታታይ የተከናወነ የተከናወነ ወር ወቅት");
        addTranslation("joke", "ቀልድ", "A thing that someone says to cause amusement or laughter", "አንድ ሰው ለማሳዝነት ወይም ለማጨናቀቅ የሚረዳ");
        addTranslation("join", "ተቀላቀለ", "To bring or come together in a union or group", "በማንኛውንም ማቅረብ ወይም በማንኛውንም ቡድን ማቅረብ");
        addTranslation("joy", "ሐሴት", "A feeling of great pleasure and happiness", "በቅድሚያ ደስታ");
        addTranslation("juice", "ጭማቂ", "The liquid obtained from or present in fruit or vegetables", "በተረጠቀ ወይም በተጠቀለ ውሃ ውስጥ ያለ ፍራፍሬ");
        addTranslation("jewel", "ጌጥ", "A precious stone", "እንደገና የተቀመጠ ወርቅ");
        addTranslation("jam", "ጭማቂ", "A sweet spread or preserve made from fruit and sugar boiled to a thick consistency", "ከፍራፍሬ እና ከስኳር የተሰራ ጭማቂ");

        // K
        addTranslation("kangaroo", "ካንጉሩ", "A large plant-eating marsupial with a long powerful tail and strongly developed hindlimbs that enable it to travel by leaping", "በትንሽ እና በሰፊ እንደገና አንቀላፋ እና ተልባች ያለው እንስሳ");
        addTranslation("king", "ንጉስ", "The male ruler of an independent state, especially one who inherits the position by right of birth", "አንድ የተረጠቀ እንደሆነ አንድ ወንድም");
        addTranslation("kiss", "መሳለል", "A touch or caress with the lips as a sign of love, sexual desire, or greeting", "በአንድ ወንድም እንደሆነ ወይም እንደሆነ እንደሆነ እንደሆነ");
        

        // Add more translations as needed...
    }

    private void addTranslation(String englishWord, String amharicWord, String englishDescription, String amharicDescription) {
        englishToAmharic.put(englishWord.toLowerCase(), amharicWord);
        amharicToEnglish.put(amharicWord, englishWord);
        englishDescriptions.put(englishWord.toLowerCase(), englishDescription);
        amharicDescriptions.put(amharicWord, amharicDescription);
    }


    // Get English to Amharic translation
    public String getEnglishToAmharic(String word) {
        return englishToAmharic.get(word.toLowerCase());
    }

    // Get Amharic to English translation
    public String getAmharicToEnglish(String word) {
        return amharicToEnglish.get(word);
    }

    // Get English description
    public String getEnglishDescription(String word) {
        return englishDescriptions.get(word.toLowerCase());
    }

    // Get Amharic description
    public String getAmharicDescription(String word) {
        return amharicDescriptions.get(word);
    }

    public String[] getEnglishWords() {
        return englishToAmharic.keySet().toArray(new String[0]);
    }

    public String[] getAmharicWords() {
        return amharicToEnglish.keySet().toArray(new String[0]);
    }
}
