/* Generated By:JavaCC: Do not edit this line. LibParser.java */
package lib;
public class LibParser implements LibParserConstants {
        private String LibName;
        private String TimeOfYearName;
        private String StaffName;
        private String BookID;

  final public void Library() throws ParseException {
    Lib();
    jj_consume_token(0);
  }

  final public void Lib() throws ParseException {
    jj_consume_token(LIBRARY);
    jj_consume_token(NAME_GENERAL);
                                   LibName = token.image;
    jj_consume_token(LB);
    LibInfo();
    jj_consume_token(RB);
  }

  final public void LibInfo() throws ParseException {
                   int[] counter = new int[5];
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WEBSITE:
        Website();
    counter[0]++;
    if (counter[0] > 1)
                { {if (true) throw new ParseException("There should be exactly one WEBSITE entry in LIBRARY "+ LibName + ". Found more than one on line " + token.beginLine);} }
        break;
      case BUILDING:
        Building();
    counter[1]++;
    if (counter[1] > 1)
                { {if (true) throw new ParseException("There should be exactly one BUILDING entry in LIBRARY "+ LibName + ". Found more than one on line " + token.beginLine);} }
        break;
      case TIMEOFYEAR:
        TimeOfYear();
    counter[2]++;
        break;
      case STAFF:
        Staff();
    counter[3]++;
        break;
      case BOOKCOLLECTION:
        BookCollection();
    counter[4]++;
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WEBSITE:
      case BUILDING:
      case TIMEOFYEAR:
      case STAFF:
      case BOOKCOLLECTION:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
    }
    if (counter[0] == 0)
        { {if (true) throw new ParseException("There should be one WEBSITE entry in LIBRARY "+ LibName + ".");} }
        if (counter[1] == 0)
        { {if (true) throw new ParseException("There should be one BUILDING entry in LIBRARY "+ LibName + ".");} }
    if (counter[2] < 1)
    { {if (true) throw new ParseException("There should be at least one TIMEOFYEAR entry in LIBRARY "+ LibName + ".");} }
    if (counter[3] < 1)
    { {if (true) throw new ParseException("There should be at least one STAFF entry in LIBRARY "+ LibName + ".");} }
    if (counter[4] < 1)
    { {if (true) throw new ParseException("There should be at least one BOOKCOLLECTION entry in LIBRARY "+ LibName + ".");} }
  }

  final public void Website() throws ParseException {
    jj_consume_token(WEBSITE);
    jj_consume_token(WEBSITE_ENTRY);
  }

  final public void Building() throws ParseException {
    jj_consume_token(BUILDING);
    jj_consume_token(BUILDING_ENTRY);
  }

  final public void TimeOfYear() throws ParseException {
    jj_consume_token(TIMEOFYEAR);
    jj_consume_token(NAME_GENERAL);
                                       TimeOfYearName = token.image;
    jj_consume_token(LB);
    TimeOfYearInfo();
    jj_consume_token(RB);
  }

  final public void TimeOfYearInfo() throws ParseException {
                          int[] counter_timeOfYear = new int[2];
    Start();
                 counter_timeOfYear[0]++;
        if (counter_timeOfYear[0] > 1)
            { {if (true) throw new ParseException("There should be exactly one START time in TIMEOFYEAR "+ TimeOfYearName + ". Found more than one on line " + token.beginLine);} }
    End();
               counter_timeOfYear[1]++;
        if (counter_timeOfYear[1] > 1)
            { {if (true) throw new ParseException("There should be exactly one END time in TIMEOFYEAR "+ TimeOfYearName + ". Found more than one on line " + token.beginLine);} }
    label_2:
    while (true) {
      Hours();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case HOURS:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
    }
            if (counter_timeOfYear[0] == 0)
                { {if (true) throw new ParseException("There should be one START time in TIMEOFYEAR "+ TimeOfYearName + ".");} }
                if (counter_timeOfYear[1] == 0)
                { {if (true) throw new ParseException("There should be one END time in TIMEOFYEAR "+ TimeOfYearName + ".");} }
  }

  final public void Start() throws ParseException {
    jj_consume_token(START);
    jj_consume_token(DAY);
    jj_consume_token(COMMA);
    jj_consume_token(DATE);
    jj_consume_token(MONTH);
    jj_consume_token(YEAR);
  }

  final public void End() throws ParseException {
    jj_consume_token(END);
    jj_consume_token(DAY);
    jj_consume_token(COMMA);
    jj_consume_token(DATE);
    jj_consume_token(MONTH);
    jj_consume_token(YEAR);
  }

  final public void Hours() throws ParseException {
    jj_consume_token(HOURS);
    HoursDay();
    jj_consume_token(LP);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TIME:
      jj_consume_token(TIME);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AM:
        jj_consume_token(AM);
        break;
      case PM:
        jj_consume_token(PM);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(TO);
      jj_consume_token(TIME);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AM:
        jj_consume_token(AM);
        break;
      case PM:
        jj_consume_token(PM);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case CLOSED:
      jj_consume_token(CLOSED);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(RP);
  }

  final public void HoursDay() throws ParseException {
    jj_consume_token(DAY_SHORT);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
      jj_consume_token(COMMA);
      jj_consume_token(DAY_SHORT);
    }
  }

  final public void Staff() throws ParseException {
    jj_consume_token(STAFF);
    jj_consume_token(NAME_GENERAL);
                                 StaffName = token.image;
    jj_consume_token(LB);
    StaffInfo();
    jj_consume_token(RB);
  }

  final public void StaffInfo() throws ParseException {
                     int[] counter_staff = new int[4];
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POSITION:
        Position();
                        counter_staff[0]++;
            if (counter_staff[0] > 1)
                    { {if (true) throw new ParseException("There should be exactly one POSITION in STAFF "+ StaffName + ". Found more than one on line " + token.beginLine);} }
        break;
      case EMAIL:
        Email();
                       counter_staff[1]++;
        break;
      case TYPE:
        Type();
                      counter_staff[2]++;
            if (counter_staff[2] > 1)
                    { {if (true) throw new ParseException("There should be exactly one TYPE in STAFF "+ StaffName + ". Found more than one on line " + token.beginLine);} }
        break;
      case RATE:
        Rate();
                      counter_staff[3]++;
            if (counter_staff[3] > 1)
                    { {if (true) throw new ParseException("There should be exactly one RATE in STAFF "+ StaffName + ". Found more than one on line " + token.beginLine);} }
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POSITION:
      case EMAIL:
      case TYPE:
      case RATE:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
    }
        if (counter_staff[0] == 0)
            { {if (true) throw new ParseException("There should be one POSITION in STAFF "+ StaffName + ".");} }
            if (counter_staff[1] < 1)
            { {if (true) throw new ParseException("There should be at least one EMAIL in STAFF "+ StaffName + ".");} }
            if (counter_staff[2] == 0)
            { {if (true) throw new ParseException("There should be one TYPE in STAFF "+ StaffName + ".");} }
            if (counter_staff[3] == 0)
            { {if (true) throw new ParseException("There should be one RATE in STAFF "+ StaffName + ".");} }
  }

  final public void Position() throws ParseException {
    jj_consume_token(POSITION);
    jj_consume_token(NAME_GENERAL);
  }

  final public void Email() throws ParseException {
    jj_consume_token(EMAIL);
    jj_consume_token(EMAIL_VALUE);
  }

  final public void Type() throws ParseException {
    jj_consume_token(TYPE);
    jj_consume_token(TYPE_VALUE);
  }

  final public void Rate() throws ParseException {
    jj_consume_token(RATE);
    jj_consume_token(RATE_VALUE);
  }

  final public void BookCollection() throws ParseException {
    jj_consume_token(BOOKCOLLECTION);
    jj_consume_token(NAME_GENERAL);
    jj_consume_token(LB);
    label_5:
    while (true) {
      BookCollectionInfo();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BOOK:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_5;
      }
    }
    jj_consume_token(RB);
  }

  final public void BookCollectionInfo() throws ParseException {
    jj_consume_token(BOOK);
    jj_consume_token(BOOK_ID);
                            BookID = token.image;
    jj_consume_token(LB);
    BookInfo();
    jj_consume_token(RB);
  }

  final public void BookInfo() throws ParseException {
                    int[] counter_book = new int[2];
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TITLE:
        BookTitle();
                  counter_book[0]++;
   if (counter_book[0] > 1)
            { {if (true) throw new ParseException("There should be exactly one book TITLE in BOOK "+ BookID + ". Found more than one on line " + token.beginLine);} }
        break;
      case AUTHOR:
        Author();
               counter_book[1]++;
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TITLE:
      case AUTHOR:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_6;
      }
    }
     if (counter_book[0] == 0)
            { {if (true) throw new ParseException("There should be one book TITLE in BOOK "+ BookID + ".");} }

            if (counter_book[1] < 1)
            { {if (true) throw new ParseException("There should be at least one AUTHOR in BOOK "+ BookID + ". Found more than one on line " + token.beginLine);} }
  }

  final public void BookTitle() throws ParseException {
    jj_consume_token(TITLE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case BOOK_TITLE:
      jj_consume_token(BOOK_TITLE);
      break;
    case NAME_GENERAL:
      jj_consume_token(NAME_GENERAL);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Author() throws ParseException {
    jj_consume_token(AUTHOR);
    jj_consume_token(DOUBLE_QUOTE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AUTHOR_NAME:
      jj_consume_token(AUTHOR_NAME);
      break;
    case DAY:
      jj_consume_token(DAY);
      break;
    case MONTH:
      jj_consume_token(MONTH);
      break;
    case DAY_SHORT:
      jj_consume_token(DAY_SHORT);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(COMMA);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AUTHOR_NAME:
        jj_consume_token(AUTHOR_NAME);
        break;
      case DAY:
        jj_consume_token(DAY);
        break;
      case MONTH:
        jj_consume_token(MONTH);
        break;
      case DAY_SHORT:
        jj_consume_token(DAY_SHORT);
        break;
      case AUTHOR_NAME_INITIAL:
        jj_consume_token(AUTHOR_NAME_INITIAL);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DAY_SHORT:
      case DAY:
      case MONTH:
      case AUTHOR_NAME:
      case AUTHOR_NAME_INITIAL:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_7;
      }
    }
    jj_consume_token(DOUBLE_QUOTE);
  }

  /** Generated Token Manager. */
  public LibParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[16];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x82038,0x82038,0x100,0x600,0x600,0x1000,0x1000000,0x5c000,0x5c000,0x100000,0x600000,0x600000,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x400,0x0,0x0,0x0,0x0,0x0,0x0,0x40001,0x2000e0,0x6000e0,0x6000e0,};
   }

  /** Constructor with InputStream. */
  public LibParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public LibParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LibParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public LibParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new LibParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public LibParser(LibParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LibParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 16; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[55];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 16; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 55; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
