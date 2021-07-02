package uk.juliusz.generateme.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.juliusz.generateme.services.GenerateMeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenerateMeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BusinessName'", "'Sender'", "'Author'", "'HomePage{'", "'PageHeader'", "'Introduction'", "'}'", "'ContentPage'", "'{'", "'Section'", "'Title'", "'Content'", "'ContactPage'", "'SendFrom'", "'SendTo'", "'GalleryPage'", "'Photo'", "'PhotoDescription'", "'PhotoFileName'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGenerateMeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenerateMeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenerateMeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenerateMe.g"; }



     	private GenerateMeGrammarAccess grammarAccess;

        public InternalGenerateMeParser(TokenStream input, GenerateMeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GenerateMeProgram";
       	}

       	@Override
       	protected GenerateMeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGenerateMeProgram"
    // InternalGenerateMe.g:64:1: entryRuleGenerateMeProgram returns [EObject current=null] : iv_ruleGenerateMeProgram= ruleGenerateMeProgram EOF ;
    public final EObject entryRuleGenerateMeProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateMeProgram = null;


        try {
            // InternalGenerateMe.g:64:58: (iv_ruleGenerateMeProgram= ruleGenerateMeProgram EOF )
            // InternalGenerateMe.g:65:2: iv_ruleGenerateMeProgram= ruleGenerateMeProgram EOF
            {
             newCompositeNode(grammarAccess.getGenerateMeProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerateMeProgram=ruleGenerateMeProgram();

            state._fsp--;

             current =iv_ruleGenerateMeProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerateMeProgram"


    // $ANTLR start "ruleGenerateMeProgram"
    // InternalGenerateMe.g:71:1: ruleGenerateMeProgram returns [EObject current=null] : ( ( (lv_config_0_0= ruleConfig ) ) ( (lv_homePage_1_0= ruleHomePage ) ) ( (lv_pages_2_0= rulePages ) )* ) ;
    public final EObject ruleGenerateMeProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_config_0_0 = null;

        EObject lv_homePage_1_0 = null;

        EObject lv_pages_2_0 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:77:2: ( ( ( (lv_config_0_0= ruleConfig ) ) ( (lv_homePage_1_0= ruleHomePage ) ) ( (lv_pages_2_0= rulePages ) )* ) )
            // InternalGenerateMe.g:78:2: ( ( (lv_config_0_0= ruleConfig ) ) ( (lv_homePage_1_0= ruleHomePage ) ) ( (lv_pages_2_0= rulePages ) )* )
            {
            // InternalGenerateMe.g:78:2: ( ( (lv_config_0_0= ruleConfig ) ) ( (lv_homePage_1_0= ruleHomePage ) ) ( (lv_pages_2_0= rulePages ) )* )
            // InternalGenerateMe.g:79:3: ( (lv_config_0_0= ruleConfig ) ) ( (lv_homePage_1_0= ruleHomePage ) ) ( (lv_pages_2_0= rulePages ) )*
            {
            // InternalGenerateMe.g:79:3: ( (lv_config_0_0= ruleConfig ) )
            // InternalGenerateMe.g:80:4: (lv_config_0_0= ruleConfig )
            {
            // InternalGenerateMe.g:80:4: (lv_config_0_0= ruleConfig )
            // InternalGenerateMe.g:81:5: lv_config_0_0= ruleConfig
            {

            					newCompositeNode(grammarAccess.getGenerateMeProgramAccess().getConfigConfigParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_config_0_0=ruleConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateMeProgramRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_0_0,
            						"uk.juliusz.generateme.GenerateMe.Config");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerateMe.g:98:3: ( (lv_homePage_1_0= ruleHomePage ) )
            // InternalGenerateMe.g:99:4: (lv_homePage_1_0= ruleHomePage )
            {
            // InternalGenerateMe.g:99:4: (lv_homePage_1_0= ruleHomePage )
            // InternalGenerateMe.g:100:5: lv_homePage_1_0= ruleHomePage
            {

            					newCompositeNode(grammarAccess.getGenerateMeProgramAccess().getHomePageHomePageParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_homePage_1_0=ruleHomePage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateMeProgramRule());
            					}
            					set(
            						current,
            						"homePage",
            						lv_homePage_1_0,
            						"uk.juliusz.generateme.GenerateMe.HomePage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerateMe.g:117:3: ( (lv_pages_2_0= rulePages ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==23||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGenerateMe.g:118:4: (lv_pages_2_0= rulePages )
            	    {
            	    // InternalGenerateMe.g:118:4: (lv_pages_2_0= rulePages )
            	    // InternalGenerateMe.g:119:5: lv_pages_2_0= rulePages
            	    {

            	    					newCompositeNode(grammarAccess.getGenerateMeProgramAccess().getPagesPagesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_pages_2_0=rulePages();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGenerateMeProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pages",
            	    						lv_pages_2_0,
            	    						"uk.juliusz.generateme.GenerateMe.Pages");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerateMeProgram"


    // $ANTLR start "entryRuleConfig"
    // InternalGenerateMe.g:140:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalGenerateMe.g:140:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalGenerateMe.g:141:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalGenerateMe.g:147:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) otherlv_2= 'Sender' ( (lv_sender_3_0= RULE_STRING ) ) otherlv_4= 'Author' ( (lv_author_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_businessName_1_0=null;
        Token otherlv_2=null;
        Token lv_sender_3_0=null;
        Token otherlv_4=null;
        Token lv_author_5_0=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:153:2: ( (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) otherlv_2= 'Sender' ( (lv_sender_3_0= RULE_STRING ) ) otherlv_4= 'Author' ( (lv_author_5_0= RULE_STRING ) ) ) )
            // InternalGenerateMe.g:154:2: (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) otherlv_2= 'Sender' ( (lv_sender_3_0= RULE_STRING ) ) otherlv_4= 'Author' ( (lv_author_5_0= RULE_STRING ) ) )
            {
            // InternalGenerateMe.g:154:2: (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) otherlv_2= 'Sender' ( (lv_sender_3_0= RULE_STRING ) ) otherlv_4= 'Author' ( (lv_author_5_0= RULE_STRING ) ) )
            // InternalGenerateMe.g:155:3: otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) otherlv_2= 'Sender' ( (lv_sender_3_0= RULE_STRING ) ) otherlv_4= 'Author' ( (lv_author_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getBusinessNameKeyword_0());
            		
            // InternalGenerateMe.g:159:3: ( (lv_businessName_1_0= RULE_STRING ) )
            // InternalGenerateMe.g:160:4: (lv_businessName_1_0= RULE_STRING )
            {
            // InternalGenerateMe.g:160:4: (lv_businessName_1_0= RULE_STRING )
            // InternalGenerateMe.g:161:5: lv_businessName_1_0= RULE_STRING
            {
            lv_businessName_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_businessName_1_0, grammarAccess.getConfigAccess().getBusinessNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"businessName",
            						lv_businessName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getSenderKeyword_2());
            		
            // InternalGenerateMe.g:181:3: ( (lv_sender_3_0= RULE_STRING ) )
            // InternalGenerateMe.g:182:4: (lv_sender_3_0= RULE_STRING )
            {
            // InternalGenerateMe.g:182:4: (lv_sender_3_0= RULE_STRING )
            // InternalGenerateMe.g:183:5: lv_sender_3_0= RULE_STRING
            {
            lv_sender_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_sender_3_0, grammarAccess.getConfigAccess().getSenderSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sender",
            						lv_sender_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getAuthorKeyword_4());
            		
            // InternalGenerateMe.g:203:3: ( (lv_author_5_0= RULE_STRING ) )
            // InternalGenerateMe.g:204:4: (lv_author_5_0= RULE_STRING )
            {
            // InternalGenerateMe.g:204:4: (lv_author_5_0= RULE_STRING )
            // InternalGenerateMe.g:205:5: lv_author_5_0= RULE_STRING
            {
            lv_author_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_author_5_0, grammarAccess.getConfigAccess().getAuthorSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author",
            						lv_author_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleHomePage"
    // InternalGenerateMe.g:225:1: entryRuleHomePage returns [EObject current=null] : iv_ruleHomePage= ruleHomePage EOF ;
    public final EObject entryRuleHomePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomePage = null;


        try {
            // InternalGenerateMe.g:225:49: (iv_ruleHomePage= ruleHomePage EOF )
            // InternalGenerateMe.g:226:2: iv_ruleHomePage= ruleHomePage EOF
            {
             newCompositeNode(grammarAccess.getHomePageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHomePage=ruleHomePage();

            state._fsp--;

             current =iv_ruleHomePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHomePage"


    // $ANTLR start "ruleHomePage"
    // InternalGenerateMe.g:232:1: ruleHomePage returns [EObject current=null] : (otherlv_0= 'HomePage{' otherlv_1= 'PageHeader' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'Introduction' ( (lv_Introduction_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleHomePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token lv_Introduction_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:238:2: ( (otherlv_0= 'HomePage{' otherlv_1= 'PageHeader' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'Introduction' ( (lv_Introduction_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalGenerateMe.g:239:2: (otherlv_0= 'HomePage{' otherlv_1= 'PageHeader' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'Introduction' ( (lv_Introduction_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalGenerateMe.g:239:2: (otherlv_0= 'HomePage{' otherlv_1= 'PageHeader' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'Introduction' ( (lv_Introduction_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalGenerateMe.g:240:3: otherlv_0= 'HomePage{' otherlv_1= 'PageHeader' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'Introduction' ( (lv_Introduction_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHomePageAccess().getHomePageKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getHomePageAccess().getPageHeaderKeyword_1());
            		
            // InternalGenerateMe.g:248:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalGenerateMe.g:249:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalGenerateMe.g:249:4: (lv_content_2_0= RULE_STRING )
            // InternalGenerateMe.g:250:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_content_2_0, grammarAccess.getHomePageAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHomePageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getHomePageAccess().getIntroductionKeyword_3());
            		
            // InternalGenerateMe.g:270:3: ( (lv_Introduction_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:271:4: (lv_Introduction_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:271:4: (lv_Introduction_4_0= RULE_STRING )
            // InternalGenerateMe.g:272:5: lv_Introduction_4_0= RULE_STRING
            {
            lv_Introduction_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_Introduction_4_0, grammarAccess.getHomePageAccess().getIntroductionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHomePageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Introduction",
            						lv_Introduction_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHomePageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHomePage"


    // $ANTLR start "entryRulePages"
    // InternalGenerateMe.g:296:1: entryRulePages returns [EObject current=null] : iv_rulePages= rulePages EOF ;
    public final EObject entryRulePages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePages = null;


        try {
            // InternalGenerateMe.g:296:46: (iv_rulePages= rulePages EOF )
            // InternalGenerateMe.g:297:2: iv_rulePages= rulePages EOF
            {
             newCompositeNode(grammarAccess.getPagesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePages=rulePages();

            state._fsp--;

             current =iv_rulePages; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePages"


    // $ANTLR start "rulePages"
    // InternalGenerateMe.g:303:1: rulePages returns [EObject current=null] : (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactPage_2= ruleContactPage ) ;
    public final EObject rulePages() throws RecognitionException {
        EObject current = null;

        EObject this_ContentPage_0 = null;

        EObject this_GalleryPage_1 = null;

        EObject this_ContactPage_2 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:309:2: ( (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactPage_2= ruleContactPage ) )
            // InternalGenerateMe.g:310:2: (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactPage_2= ruleContactPage )
            {
            // InternalGenerateMe.g:310:2: (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactPage_2= ruleContactPage )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGenerateMe.g:311:3: this_ContentPage_0= ruleContentPage
                    {

                    			newCompositeNode(grammarAccess.getPagesAccess().getContentPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentPage_0=ruleContentPage();

                    state._fsp--;


                    			current = this_ContentPage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerateMe.g:320:3: this_GalleryPage_1= ruleGalleryPage
                    {

                    			newCompositeNode(grammarAccess.getPagesAccess().getGalleryPageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GalleryPage_1=ruleGalleryPage();

                    state._fsp--;


                    			current = this_GalleryPage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGenerateMe.g:329:3: this_ContactPage_2= ruleContactPage
                    {

                    			newCompositeNode(grammarAccess.getPagesAccess().getContactPageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContactPage_2=ruleContactPage();

                    state._fsp--;


                    			current = this_ContactPage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePages"


    // $ANTLR start "entryRuleContentPage"
    // InternalGenerateMe.g:341:1: entryRuleContentPage returns [EObject current=null] : iv_ruleContentPage= ruleContentPage EOF ;
    public final EObject entryRuleContentPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentPage = null;


        try {
            // InternalGenerateMe.g:341:52: (iv_ruleContentPage= ruleContentPage EOF )
            // InternalGenerateMe.g:342:2: iv_ruleContentPage= ruleContentPage EOF
            {
             newCompositeNode(grammarAccess.getContentPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentPage=ruleContentPage();

            state._fsp--;

             current =iv_ruleContentPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentPage"


    // $ANTLR start "ruleContentPage"
    // InternalGenerateMe.g:348:1: ruleContentPage returns [EObject current=null] : (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) ( (lv_section_5_0= ruleSection ) )* otherlv_6= '}' ) ;
    public final EObject ruleContentPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_header_4_0=null;
        Token otherlv_6=null;
        EObject lv_section_5_0 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:354:2: ( (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) ( (lv_section_5_0= ruleSection ) )* otherlv_6= '}' ) )
            // InternalGenerateMe.g:355:2: (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) ( (lv_section_5_0= ruleSection ) )* otherlv_6= '}' )
            {
            // InternalGenerateMe.g:355:2: (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) ( (lv_section_5_0= ruleSection ) )* otherlv_6= '}' )
            // InternalGenerateMe.g:356:3: otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) ( (lv_section_5_0= ruleSection ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContentPageAccess().getContentPageKeyword_0());
            		
            // InternalGenerateMe.g:360:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:361:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:361:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:362:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContentPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getContentPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContentPageAccess().getPageHeaderKeyword_3());
            		
            // InternalGenerateMe.g:386:3: ( (lv_header_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:387:4: (lv_header_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:387:4: (lv_header_4_0= RULE_STRING )
            // InternalGenerateMe.g:388:5: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_header_4_0, grammarAccess.getContentPageAccess().getHeaderSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"header",
            						lv_header_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGenerateMe.g:404:3: ( (lv_section_5_0= ruleSection ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGenerateMe.g:405:4: (lv_section_5_0= ruleSection )
            	    {
            	    // InternalGenerateMe.g:405:4: (lv_section_5_0= ruleSection )
            	    // InternalGenerateMe.g:406:5: lv_section_5_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getContentPageAccess().getSectionSectionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_section_5_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContentPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"section",
            	    						lv_section_5_0,
            	    						"uk.juliusz.generateme.GenerateMe.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContentPageAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentPage"


    // $ANTLR start "entryRuleSection"
    // InternalGenerateMe.g:431:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalGenerateMe.g:431:48: (iv_ruleSection= ruleSection EOF )
            // InternalGenerateMe.g:432:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalGenerateMe.g:438:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Content' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_content_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:444:2: ( (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Content' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalGenerateMe.g:445:2: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Content' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalGenerateMe.g:445:2: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Content' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalGenerateMe.g:446:3: otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Title' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Content' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalGenerateMe.g:450:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:451:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:451:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:452:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getTitleKeyword_3());
            		
            // InternalGenerateMe.g:476:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:477:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:477:4: (lv_title_4_0= RULE_STRING )
            // InternalGenerateMe.g:478:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_title_4_0, grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getContentKeyword_5());
            		
            // InternalGenerateMe.g:498:3: ( (lv_content_6_0= RULE_STRING ) )
            // InternalGenerateMe.g:499:4: (lv_content_6_0= RULE_STRING )
            {
            // InternalGenerateMe.g:499:4: (lv_content_6_0= RULE_STRING )
            // InternalGenerateMe.g:500:5: lv_content_6_0= RULE_STRING
            {
            lv_content_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_content_6_0, grammarAccess.getSectionAccess().getContentSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleContactPage"
    // InternalGenerateMe.g:524:1: entryRuleContactPage returns [EObject current=null] : iv_ruleContactPage= ruleContactPage EOF ;
    public final EObject entryRuleContactPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactPage = null;


        try {
            // InternalGenerateMe.g:524:52: (iv_ruleContactPage= ruleContactPage EOF )
            // InternalGenerateMe.g:525:2: iv_ruleContactPage= ruleContactPage EOF
            {
             newCompositeNode(grammarAccess.getContactPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContactPage=ruleContactPage();

            state._fsp--;

             current =iv_ruleContactPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContactPage"


    // $ANTLR start "ruleContactPage"
    // InternalGenerateMe.g:531:1: ruleContactPage returns [EObject current=null] : (otherlv_0= 'ContactPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'SendFrom' ( (lv_from_6_0= RULE_STRING ) ) otherlv_7= 'SendTo' ( (lv_to_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleContactPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token lv_from_6_0=null;
        Token otherlv_7=null;
        Token lv_to_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:537:2: ( (otherlv_0= 'ContactPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'SendFrom' ( (lv_from_6_0= RULE_STRING ) ) otherlv_7= 'SendTo' ( (lv_to_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalGenerateMe.g:538:2: (otherlv_0= 'ContactPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'SendFrom' ( (lv_from_6_0= RULE_STRING ) ) otherlv_7= 'SendTo' ( (lv_to_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalGenerateMe.g:538:2: (otherlv_0= 'ContactPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'SendFrom' ( (lv_from_6_0= RULE_STRING ) ) otherlv_7= 'SendTo' ( (lv_to_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalGenerateMe.g:539:3: otherlv_0= 'ContactPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'SendFrom' ( (lv_from_6_0= RULE_STRING ) ) otherlv_7= 'SendTo' ( (lv_to_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getContactPageAccess().getContactPageKeyword_0());
            		
            // InternalGenerateMe.g:543:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:544:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:544:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:545:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContactPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getContactPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContactPageAccess().getPageHeaderKeyword_3());
            		
            // InternalGenerateMe.g:569:3: ( (lv_header_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:570:4: (lv_header_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:570:4: (lv_header_4_0= RULE_STRING )
            // InternalGenerateMe.g:571:5: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_header_4_0, grammarAccess.getContactPageAccess().getHeaderSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"header",
            						lv_header_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getContactPageAccess().getSendFromKeyword_5());
            		
            // InternalGenerateMe.g:591:3: ( (lv_from_6_0= RULE_STRING ) )
            // InternalGenerateMe.g:592:4: (lv_from_6_0= RULE_STRING )
            {
            // InternalGenerateMe.g:592:4: (lv_from_6_0= RULE_STRING )
            // InternalGenerateMe.g:593:5: lv_from_6_0= RULE_STRING
            {
            lv_from_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_from_6_0, grammarAccess.getContactPageAccess().getFromSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getContactPageAccess().getSendToKeyword_7());
            		
            // InternalGenerateMe.g:613:3: ( (lv_to_8_0= RULE_STRING ) )
            // InternalGenerateMe.g:614:4: (lv_to_8_0= RULE_STRING )
            {
            // InternalGenerateMe.g:614:4: (lv_to_8_0= RULE_STRING )
            // InternalGenerateMe.g:615:5: lv_to_8_0= RULE_STRING
            {
            lv_to_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_to_8_0, grammarAccess.getContactPageAccess().getToSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContactPageAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContactPage"


    // $ANTLR start "entryRuleGalleryPage"
    // InternalGenerateMe.g:639:1: entryRuleGalleryPage returns [EObject current=null] : iv_ruleGalleryPage= ruleGalleryPage EOF ;
    public final EObject entryRuleGalleryPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGalleryPage = null;


        try {
            // InternalGenerateMe.g:639:52: (iv_ruleGalleryPage= ruleGalleryPage EOF )
            // InternalGenerateMe.g:640:2: iv_ruleGalleryPage= ruleGalleryPage EOF
            {
             newCompositeNode(grammarAccess.getGalleryPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGalleryPage=ruleGalleryPage();

            state._fsp--;

             current =iv_ruleGalleryPage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGalleryPage"


    // $ANTLR start "ruleGalleryPage"
    // InternalGenerateMe.g:646:1: ruleGalleryPage returns [EObject current=null] : (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) )* otherlv_4= '}' ) ;
    public final EObject ruleGalleryPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_photos_3_0 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:652:2: ( (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) )* otherlv_4= '}' ) )
            // InternalGenerateMe.g:653:2: (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) )* otherlv_4= '}' )
            {
            // InternalGenerateMe.g:653:2: (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) )* otherlv_4= '}' )
            // InternalGenerateMe.g:654:3: otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGalleryPageAccess().getGalleryPageKeyword_0());
            		
            // InternalGenerateMe.g:658:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:659:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:659:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:660:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGalleryPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGalleryPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGalleryPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenerateMe.g:680:3: ( (lv_photos_3_0= rulePhoto ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGenerateMe.g:681:4: (lv_photos_3_0= rulePhoto )
            	    {
            	    // InternalGenerateMe.g:681:4: (lv_photos_3_0= rulePhoto )
            	    // InternalGenerateMe.g:682:5: lv_photos_3_0= rulePhoto
            	    {

            	    					newCompositeNode(grammarAccess.getGalleryPageAccess().getPhotosPhotoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_photos_3_0=rulePhoto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGalleryPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"photos",
            	    						lv_photos_3_0,
            	    						"uk.juliusz.generateme.GenerateMe.Photo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGalleryPageAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGalleryPage"


    // $ANTLR start "entryRulePhoto"
    // InternalGenerateMe.g:707:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalGenerateMe.g:707:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalGenerateMe.g:708:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalGenerateMe.g:714:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_fileName_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:720:2: ( (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalGenerateMe.g:721:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalGenerateMe.g:721:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalGenerateMe.g:722:3: otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalGenerateMe.g:726:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:727:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:727:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:728:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getPhotoDescriptionKeyword_3());
            		
            // InternalGenerateMe.g:752:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:753:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:753:4: (lv_description_4_0= RULE_STRING )
            // InternalGenerateMe.g:754:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_description_4_0, grammarAccess.getPhotoAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPhotoAccess().getPhotoFileNameKeyword_5());
            		
            // InternalGenerateMe.g:774:3: ( (lv_fileName_6_0= RULE_STRING ) )
            // InternalGenerateMe.g:775:4: (lv_fileName_6_0= RULE_STRING )
            {
            // InternalGenerateMe.g:775:4: (lv_fileName_6_0= RULE_STRING )
            // InternalGenerateMe.g:776:5: lv_fileName_6_0= RULE_STRING
            {
            lv_fileName_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_fileName_6_0, grammarAccess.getPhotoAccess().getFileNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoto"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004840002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}