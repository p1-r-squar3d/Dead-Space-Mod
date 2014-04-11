package deadspacemod.common;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import deadspacemod.common.items.DSCoreItems;

public class DSCreativeTab extends CreativeTabs 
{
	DSCreativeTab(String par1Str)
    {
        super(par1Str);
    }

    @SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex()
    {
        return DSCoreItems.creativeTabIcon.itemID;
    }
}
