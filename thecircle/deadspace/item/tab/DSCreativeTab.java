package thecircle.deadspace.item.tab;

import thecircle.deadspace.item.DSCoreItems;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DSCreativeTab extends CreativeTabs 
{
	public DSCreativeTab(String par1Str)
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
