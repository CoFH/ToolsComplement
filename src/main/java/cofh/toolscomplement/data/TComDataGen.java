//package cofh.toolscomplement.data;
//
//import net.minecraft.data.DataGenerator;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.minecraftforge.data.event.GatherDataEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//
//import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
//
//@Mod.EventBusSubscriber (bus = Mod.EventBusSubscriber.Bus.MOD, modid = ID_TOOLS_COMPLEMENT)
//public class TComDataGen {
//
//    @SubscribeEvent
//    public static void gatherData(final GatherDataEvent event) {
//
//
//        DataGenerator gen = event.getGenerator();
//        ExistingFileHelper exFileHelper = event.getExistingFileHelper();
//
//        TComTagsProvider.Block blockTags = new TComTagsProvider.Block(gen, exFileHelper);
//
//        gen.addProvider(event.includeServer(), blockTags);
//        gen.addProvider(event.includeServer(), new TComTagsProvider.Item(gen, blockTags, exFileHelper));
//
//        gen.addProvider(event.includeServer(), new TComRecipeProvider(gen));
//
//        gen.addProvider(event.includeClient(), new TComItemModelProvider(gen, exFileHelper));
//    }
//
//}
