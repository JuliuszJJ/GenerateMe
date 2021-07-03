/*
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.juliusz.generateme.ide.contentassist.antlr.internal.InternalGenerateMeParser;
import uk.juliusz.generateme.services.GenerateMeGrammarAccess;

public class GenerateMeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GenerateMeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GenerateMeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPagesAccess().getAlternatives(), "rule__Pages__Alternatives");
			builder.put(grammarAccess.getGenerateMeProgramAccess().getGroup(), "rule__GenerateMeProgram__Group__0");
			builder.put(grammarAccess.getConfigAccess().getGroup(), "rule__Config__Group__0");
			builder.put(grammarAccess.getHomePageAccess().getGroup(), "rule__HomePage__Group__0");
			builder.put(grammarAccess.getContentPageAccess().getGroup(), "rule__ContentPage__Group__0");
			builder.put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
			builder.put(grammarAccess.getContactPageAccess().getGroup(), "rule__ContactPage__Group__0");
			builder.put(grammarAccess.getGalleryPageAccess().getGroup(), "rule__GalleryPage__Group__0");
			builder.put(grammarAccess.getPhotoAccess().getGroup(), "rule__Photo__Group__0");
			builder.put(grammarAccess.getGenerateMeProgramAccess().getConfigAssignment_0(), "rule__GenerateMeProgram__ConfigAssignment_0");
			builder.put(grammarAccess.getGenerateMeProgramAccess().getHomePageAssignment_1(), "rule__GenerateMeProgram__HomePageAssignment_1");
			builder.put(grammarAccess.getGenerateMeProgramAccess().getPagesAssignment_2(), "rule__GenerateMeProgram__PagesAssignment_2");
			builder.put(grammarAccess.getConfigAccess().getBusinessNameAssignment_1(), "rule__Config__BusinessNameAssignment_1");
			builder.put(grammarAccess.getHomePageAccess().getContentAssignment_2(), "rule__HomePage__ContentAssignment_2");
			builder.put(grammarAccess.getHomePageAccess().getIntroductionAssignment_4(), "rule__HomePage__IntroductionAssignment_4");
			builder.put(grammarAccess.getContentPageAccess().getNameAssignment_1(), "rule__ContentPage__NameAssignment_1");
			builder.put(grammarAccess.getContentPageAccess().getHeaderAssignment_4(), "rule__ContentPage__HeaderAssignment_4");
			builder.put(grammarAccess.getContentPageAccess().getSectionAssignment_5(), "rule__ContentPage__SectionAssignment_5");
			builder.put(grammarAccess.getSectionAccess().getNameAssignment_1(), "rule__Section__NameAssignment_1");
			builder.put(grammarAccess.getSectionAccess().getTitleAssignment_4(), "rule__Section__TitleAssignment_4");
			builder.put(grammarAccess.getSectionAccess().getContentAssignment_6(), "rule__Section__ContentAssignment_6");
			builder.put(grammarAccess.getContactPageAccess().getNameAssignment_1(), "rule__ContactPage__NameAssignment_1");
			builder.put(grammarAccess.getContactPageAccess().getHeaderAssignment_4(), "rule__ContactPage__HeaderAssignment_4");
			builder.put(grammarAccess.getContactPageAccess().getFromAssignment_6(), "rule__ContactPage__FromAssignment_6");
			builder.put(grammarAccess.getContactPageAccess().getToAssignment_8(), "rule__ContactPage__ToAssignment_8");
			builder.put(grammarAccess.getGalleryPageAccess().getNameAssignment_1(), "rule__GalleryPage__NameAssignment_1");
			builder.put(grammarAccess.getGalleryPageAccess().getPhotosAssignment_3(), "rule__GalleryPage__PhotosAssignment_3");
			builder.put(grammarAccess.getPhotoAccess().getNameAssignment_1(), "rule__Photo__NameAssignment_1");
			builder.put(grammarAccess.getPhotoAccess().getDescriptionAssignment_4(), "rule__Photo__DescriptionAssignment_4");
			builder.put(grammarAccess.getPhotoAccess().getFileNameAssignment_6(), "rule__Photo__FileNameAssignment_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GenerateMeGrammarAccess grammarAccess;

	@Override
	protected InternalGenerateMeParser createParser() {
		InternalGenerateMeParser result = new InternalGenerateMeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GenerateMeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GenerateMeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
