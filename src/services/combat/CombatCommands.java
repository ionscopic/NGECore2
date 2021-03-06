/*******************************************************************************
 * Copyright (c) 2013 <Project SWG>
 * 
 * This File is part of NGECore2.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Using NGEngine to work with NGECore2 is making a combined work based on NGEngine. 
 * Therefore all terms and conditions of the GNU Lesser General Public License cover the combination.
 ******************************************************************************/
package services.combat;

import main.NGECore;

public class CombatCommands {
	
	public static void registerCommands(NGECore core) {
		
		// Auto Attacks
		
		core.commandService.registerCombatCommand("rangedshotrifle");
		core.commandService.registerCombatCommand("rangedshotpistol");
		core.commandService.registerCombatCommand("rangedshotlightrifle");
		core.commandService.registerCombatCommand("rangedshot");
		core.commandService.registerCombatCommand("meleehit");
		core.commandService.registerCombatCommand("saberhit");
		core.commandService.registerCombatCommand("fireAcidBeam");
		core.commandService.registerCombatCommand("fireAcidBeamAvatar");
		core.commandService.registerCombatCommand("fireAcidBeamHeavy");
		core.commandService.registerCombatCommand("fireAcidRifle");
		core.commandService.registerCombatCommand("fireCr1BlastCannon");
		core.commandService.registerCombatCommand("fireCrusaderHeavyRifle");
		core.commandService.registerCombatCommand("fireElitePistolLauncher");
		core.commandService.registerCombatCommand("fireFlameThrowerLight");
		core.commandService.registerCombatCommand("fireHeavyShotgun");
		core.commandService.registerCombatCommand("fireHeavyWeapon");
		core.commandService.registerCombatCommand("fireIceGun");
		core.commandService.registerCombatCommand("fireLavaCannon");
		//core.commandService.registerCombatCommand("fireLavaCannonGeneric");
		core.commandService.registerCombatCommand("fireLightningBeam");
		core.commandService.registerCombatCommand("fireParticleBeam");
		core.commandService.registerCombatCommand("firePistolLauncher");
		//core.commandService.registerCombatCommand("firePistolLauncherGeneric");
		core.commandService.registerCombatCommand("firePistolLauncherMedium");
		core.commandService.registerCombatCommand("firePistolLauncherTargeting");
		core.commandService.registerCombatCommand("firePlasmaFlameThrower");
		core.commandService.registerCombatCommand("firePulseCannon");
		core.commandService.registerCombatCommand("firePvpHeavy");
		core.commandService.registerCombatCommand("fireRepublicFlameThrower");
		//core.commandService.registerCombatCommand("fireRepublicFlameThrowerGeneric");
		core.commandService.registerCombatCommand("fireRocketLauncher");
		//core.commandService.registerCombatCommand("fireRocketLauncherGeneric");
		core.commandService.registerCombatCommand("fireStunCannon");
		core.commandService.registerCombatCommand("fireVoidRocketLauncher");
		
		
		// Bounty Hunter
		
		core.commandService.registerCombatCommand("bh_ae_dm_1");
		core.commandService.registerCombatCommand("bh_ae_dm_2");
		core.commandService.registerCombatCommand("bh_dm_1");
		core.commandService.registerCombatCommand("bh_dm_2");
		core.commandService.registerCombatCommand("bh_dm_3");
		core.commandService.registerCombatCommand("bh_dm_4");
		core.commandService.registerCombatCommand("bh_dm_5");
		core.commandService.registerCombatCommand("bh_dm_6");
		core.commandService.registerCombatCommand("bh_dm_7");
		core.commandService.registerCombatCommand("bh_dm_8");
		core.commandService.registerCombatCommand("bh_dm_cc_1");
		core.commandService.registerCombatCommand("bh_dm_cc_2");
		core.commandService.registerCombatCommand("bh_dm_cc_3");
		core.commandService.registerCombatCommand("bh_dm_crit_1");
		core.commandService.registerCombatCommand("bh_dm_crit_2");
		core.commandService.registerCombatCommand("bh_dm_crit_3");
		core.commandService.registerCombatCommand("bh_dm_crit_4");
		core.commandService.registerCombatCommand("bh_dm_crit_5");
		core.commandService.registerCombatCommand("bh_dm_crit_6");
		core.commandService.registerCombatCommand("bh_dm_crit_7");
		core.commandService.registerCombatCommand("bh_dm_crit_8");
		core.commandService.registerCombatCommand("bh_dread_strike_1");
		core.commandService.registerCombatCommand("bh_dread_strike_2");
		core.commandService.registerCombatCommand("bh_dread_strike_3");
		core.commandService.registerCombatCommand("bh_dread_strike_4");
		core.commandService.registerCombatCommand("bh_dread_strike_5");
		core.commandService.registerCombatCommand("bh_flawless_strike");
		core.commandService.registerCombatCommand("bh_fumble_1");
		core.commandService.registerCombatCommand("bh_fumble_2");
		core.commandService.registerCombatCommand("bh_fumble_3");
		core.commandService.registerCombatCommand("bh_fumble_4");
		core.commandService.registerCombatCommand("bh_fumble_5");
		core.commandService.registerCombatCommand("bh_fumble_6");
		core.commandService.registerCombatCommand("bh_intimidate_1");
		core.commandService.registerCombatCommand("bh_intimidate_2");
		core.commandService.registerCombatCommand("bh_intimidate_3");
		core.commandService.registerCombatCommand("bh_intimidate_4");
		core.commandService.registerCombatCommand("bh_intimidate_5");
		core.commandService.registerCombatCommand("bh_intimidate_6");
		core.commandService.registerCombatCommand("bh_sniper_1");
		core.commandService.registerCombatCommand("bh_sniper_2");
		core.commandService.registerCombatCommand("bh_sniper_3");
		core.commandService.registerCombatCommand("bh_sniper_4");
		core.commandService.registerCombatCommand("bh_sniper_5");
		core.commandService.registerCombatCommand("bh_sniper_6");
		core.commandService.registerCombatCommand("bh_stun_1");
		core.commandService.registerCombatCommand("bh_stun_2");
		core.commandService.registerCombatCommand("bh_stun_3");
		core.commandService.registerCombatCommand("bh_stun_4");
		core.commandService.registerCombatCommand("bh_stun_5");
		core.commandService.registerCombatCommand("bh_stun_6");
		core.commandService.registerCombatCommand("bh_taunt_1");
		core.commandService.registerCombatCommand("bh_taunt_2");
		core.commandService.registerCombatCommand("bh_taunt_3");
		core.commandService.registerCombatCommand("bh_taunt_4");
		core.commandService.registerCombatCommand("bh_taunt_5");
		core.commandService.registerCombatCommand("bh_taunt_6");
		core.commandService.registerCombatCommand("bh_return_fire_1");
		core.commandService.registerCombatCommand("bh_sh_0");
		core.commandService.registerCombatCommand("bh_sh_1");
		core.commandService.registerCombatCommand("bh_sh_2");
		core.commandService.registerCombatCommand("bh_sh_3");
		
		
		
		// Jedi
		
		core.commandService.registerCombatCommand("fs_sweep_1");
		core.commandService.registerCombatCommand("fs_sweep_2");
		core.commandService.registerCombatCommand("fs_sweep_3");
		core.commandService.registerCombatCommand("fs_sweep_4");
		core.commandService.registerCombatCommand("fs_sweep_5");
		core.commandService.registerCombatCommand("fs_sweep_6");
		core.commandService.registerCombatCommand("fs_sweep_7");
		core.commandService.registerCombatCommand("fs_dm_1");
		core.commandService.registerCombatCommand("fs_dm_2");
		core.commandService.registerCombatCommand("fs_dm_3");
		core.commandService.registerCombatCommand("fs_dm_4");
		core.commandService.registerCombatCommand("fs_dm_5");
		core.commandService.registerCombatCommand("fs_dm_6");
		core.commandService.registerCombatCommand("fs_dm_7");
		core.commandService.registerCombatCommand("fs_dm_cc_1");
		core.commandService.registerCombatCommand("fs_dm_cc_2");
		core.commandService.registerCombatCommand("fs_dm_cc_3");
		core.commandService.registerCombatCommand("fs_dm_cc_4");
		core.commandService.registerCombatCommand("fs_dm_cc_5");
		core.commandService.registerCombatCommand("fs_dm_cc_6");
		core.commandService.registerCombatCommand("fs_ae_dm_cc_1");
		core.commandService.registerCombatCommand("fs_ae_dm_cc_2");
		core.commandService.registerCombatCommand("fs_ae_dm_cc_3");
		core.commandService.registerCombatCommand("fs_ae_dm_cc_4");
		core.commandService.registerCombatCommand("fs_ae_dm_cc_5");
		core.commandService.registerCombatCommand("fs_ae_dm_cc_6");
		core.commandService.registerCombatCommand("forceThrow");
		core.commandService.registerCombatCommand("fs_dm_cc_crit_1");
		core.commandService.registerCombatCommand("fs_dm_cc_crit_2");
		core.commandService.registerCombatCommand("fs_dm_cc_crit_3");
		core.commandService.registerCombatCommand("fs_dm_cc_crit_4");
		core.commandService.registerCombatCommand("fs_dm_cc_crit_5");
		core.commandService.registerCombatCommand("fs_drain_1");
		core.commandService.registerCombatCommand("fs_drain_2");
		core.commandService.registerCombatCommand("fs_drain_3");
		core.commandService.registerCombatCommand("fs_drain_4");
		core.commandService.registerCombatCommand("fs_drain_5");
		core.commandService.registerCombatCommand("fs_flurry_1");
		core.commandService.registerCombatCommand("fs_flurry_2");
		core.commandService.registerCombatCommand("fs_flurry_3");
		core.commandService.registerCombatCommand("fs_flurry_4");
		core.commandService.registerCombatCommand("fs_flurry_5");
		core.commandService.registerCombatCommand("fs_flurry_6");
		core.commandService.registerCombatCommand("fs_flurry_7");
		core.commandService.registerCombatCommand("fs_maelstrom_1");
		core.commandService.registerCombatCommand("fs_maelstrom_2");
		core.commandService.registerCombatCommand("fs_maelstrom_3");
		core.commandService.registerCombatCommand("fs_maelstrom_4");
		core.commandService.registerCombatCommand("fs_maelstrom_5");
		core.commandService.registerCombatCommand("fs_sh_0");
		core.commandService.registerCombatCommand("fs_sh_1");
		core.commandService.registerCombatCommand("fs_sh_2");
		core.commandService.registerCombatCommand("fs_sh_3");
		core.commandService.registerCommand("fs_buff_def_1_1"); // Stance
		core.commandService.registerCommand("fs_buff_ca_1"); // Focus
		core.commandService.registerCommand("fs_saber_reflect_buff"); // Saber Reflect
		core.commandService.registerCommand("saberBlock"); // Saber Block
		core.commandService.registerCommand("forcerun"); // Force Run
		core.commandService.registerCommand("fs_buff_invis_1"); // Force Cloak

		
		// Commando
		
		core.commandService.registerCombatCommand("co_ae_dm_1");
		core.commandService.registerCombatCommand("co_ae_dm_2");
		core.commandService.registerCombatCommand("co_ae_dm_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_acid_1");
		core.commandService.registerCombatCommand("co_ae_hw_dot_acid_2");
		core.commandService.registerCombatCommand("co_ae_hw_dot_acid_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_acid_4");
		core.commandService.registerCombatCommand("co_ae_hw_dot_acid_5");
		core.commandService.registerCombatCommand("co_ae_hw_dot_cold_1");
		core.commandService.registerCombatCommand("co_ae_hw_dot_cold_2");
		core.commandService.registerCombatCommand("co_ae_hw_dot_cold_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_cold_4");
		core.commandService.registerCombatCommand("co_ae_hw_dot_cold_5");
		core.commandService.registerCombatCommand("co_ae_hw_dot_electrical_1");
		core.commandService.registerCombatCommand("co_ae_hw_dot_electrical_2");
		core.commandService.registerCombatCommand("co_ae_hw_dot_electrical_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_electrical_4");
		core.commandService.registerCombatCommand("co_ae_hw_dot_electrical_5");
		core.commandService.registerCombatCommand("co_ae_hw_dot_energy_1");
		core.commandService.registerCombatCommand("co_ae_hw_dot_energy_2");
		core.commandService.registerCombatCommand("co_ae_hw_dot_energy_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_energy_4");
		core.commandService.registerCombatCommand("co_ae_hw_dot_energy_5");
		core.commandService.registerCombatCommand("co_ae_hw_dot_fire_1");
		core.commandService.registerCombatCommand("co_ae_hw_dot_fire_2");
		core.commandService.registerCombatCommand("co_ae_hw_dot_fire_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_fire_4");
		core.commandService.registerCombatCommand("co_ae_hw_dot_fire_5");
		core.commandService.registerCombatCommand("co_ae_hw_dot_kinetic_1");
		core.commandService.registerCombatCommand("co_ae_hw_dot_kinetic_2");
		core.commandService.registerCombatCommand("co_ae_hw_dot_kinetic_3");
		core.commandService.registerCombatCommand("co_ae_hw_dot_kinetic_4");
		core.commandService.registerCombatCommand("co_ae_hw_dot_kinetic_5");
		core.commandService.registerCombatCommand("co_armor_cracker");
		core.commandService.registerCombatCommand("co_cluster_bomb");
		core.commandService.registerCombatCommand("co_cluster_bomblet");
		core.commandService.registerCombatCommand("co_del_ae_cc_1_1");
		core.commandService.registerCombatCommand("co_del_ae_cc_1_2");
		core.commandService.registerCombatCommand("co_del_ae_cc_1_3");
		core.commandService.registerCombatCommand("co_del_ae_cc_2_1");
		core.commandService.registerCombatCommand("co_del_ae_cc_2_2");
		core.commandService.registerCombatCommand("co_del_ae_dm_1");
		core.commandService.registerCombatCommand("co_del_ae_dm_2");
		core.commandService.registerCombatCommand("co_del_ae_dm_3");
		core.commandService.registerCombatCommand("co_dm_1");
		core.commandService.registerCombatCommand("co_dm_2");
		core.commandService.registerCombatCommand("co_dm_3");
		core.commandService.registerCombatCommand("co_dm_4");
		core.commandService.registerCombatCommand("co_dm_5");
		core.commandService.registerCombatCommand("co_dm_6");
		core.commandService.registerCombatCommand("co_dm_7");
		core.commandService.registerCombatCommand("co_dm_8");
		core.commandService.registerCombatCommand("co_fld_dm_1");
		core.commandService.registerCombatCommand("co_fld_dm_2");
		core.commandService.registerCombatCommand("co_hw_dm_1");
		core.commandService.registerCombatCommand("co_hw_dm_2");
		core.commandService.registerCombatCommand("co_hw_dm_3");
		core.commandService.registerCombatCommand("co_hw_dm_4");
		core.commandService.registerCombatCommand("co_hw_dm_5");
		core.commandService.registerCombatCommand("co_hw_dm_6");
		core.commandService.registerCombatCommand("co_hw_dm_crit_1");
		core.commandService.registerCombatCommand("co_hw_dm_crit_2");
		core.commandService.registerCombatCommand("co_hw_dm_crit_3");
		core.commandService.registerCombatCommand("co_hw_dm_crit_4");
		core.commandService.registerCombatCommand("co_hw_dm_crit_5");
		core.commandService.registerCombatCommand("co_hw_dm_crit_6");
		core.commandService.registerCombatCommand("co_hw_dot_acid_1");
		core.commandService.registerCombatCommand("co_hw_dot_acid_2");
		core.commandService.registerCombatCommand("co_hw_dot_acid_3");
		core.commandService.registerCombatCommand("co_hw_dot_acid_4");
		core.commandService.registerCombatCommand("co_hw_dot_acid_5");
		core.commandService.registerCombatCommand("co_hw_dot_cold_1");
		core.commandService.registerCombatCommand("co_hw_dot_cold_2");
		core.commandService.registerCombatCommand("co_hw_dot_cold_3");
		core.commandService.registerCombatCommand("co_hw_dot_cold_4");
		core.commandService.registerCombatCommand("co_hw_dot_cold_5");
		core.commandService.registerCombatCommand("co_hw_dot_electrical_1");
		core.commandService.registerCombatCommand("co_hw_dot_electrical_2");
		core.commandService.registerCombatCommand("co_hw_dot_electrical_3");
		core.commandService.registerCombatCommand("co_hw_dot_electrical_4");
		core.commandService.registerCombatCommand("co_hw_dot_electrical_5");
		core.commandService.registerCombatCommand("co_hw_dot_energy_1");
		core.commandService.registerCombatCommand("co_hw_dot_energy_2");
		core.commandService.registerCombatCommand("co_hw_dot_energy_3");
		core.commandService.registerCombatCommand("co_hw_dot_energy_4");
		core.commandService.registerCombatCommand("co_hw_dot_energy_5");
		core.commandService.registerCombatCommand("co_hw_dot_fire_1");
		core.commandService.registerCombatCommand("co_hw_dot_fire_2");
		core.commandService.registerCombatCommand("co_hw_dot_fire_3");
		core.commandService.registerCombatCommand("co_hw_dot_fire_4");
		core.commandService.registerCombatCommand("co_hw_dot_fire_5");
		core.commandService.registerCombatCommand("co_hw_dot_kinetic_1");
		core.commandService.registerCombatCommand("co_hw_dot_kinetic_2");
		core.commandService.registerCombatCommand("co_hw_dot_kinetic_3");
		core.commandService.registerCombatCommand("co_hw_dot_kinetic_4");
		core.commandService.registerCombatCommand("co_hw_dot_kinetic_5");
		core.commandService.registerCombatCommand("co_remote_detonator_1");
		core.commandService.registerCombatCommand("co_remote_detonator_2");
		core.commandService.registerCombatCommand("co_remote_detonator_3");
		core.commandService.registerCombatCommand("co_remote_detonator_4");
		core.commandService.registerCombatCommand("co_remote_detonator_5");
		core.commandService.registerCombatCommand("co_remote_detonator_5");
		core.commandService.registerCombatCommand("co_riddle_armor");
		core.commandService.registerCombatCommand("co_suppressing_fire");
		core.commandService.registerCombatCommand("co_sh_0");
		core.commandService.registerCombatCommand("co_sh_1");
		core.commandService.registerCombatCommand("co_sh_2");
		core.commandService.registerCombatCommand("co_sh_3");
		core.commandService.registerCommand("co_hw_dot");
		core.commandService.registerCommand("co_ae_hw_dot");
		

		// Entertainer
		
		core.commandService.registerCombatCommand("en_dm_1");
		core.commandService.registerCombatCommand("en_dm_2");
		core.commandService.registerCombatCommand("en_dm_3");
		core.commandService.registerCombatCommand("en_dm_4");
		core.commandService.registerCombatCommand("en_dm_5");
		core.commandService.registerCombatCommand("en_dm_6");
		core.commandService.registerCombatCommand("en_dm_7");
		core.commandService.registerCombatCommand("en_dm_8");
		core.commandService.registerCombatCommand("en_project_will_0");
		core.commandService.registerCombatCommand("en_project_will_1");
		core.commandService.registerCombatCommand("en_project_will_2");
		core.commandService.registerCombatCommand("en_project_will_3");
		core.commandService.registerCombatCommand("en_project_will_4");
		core.commandService.registerCombatCommand("en_project_will_5");
		core.commandService.registerCombatCommand("en_project_will_6");
		core.commandService.registerCombatCommand("en_spiral_kick_0");
		core.commandService.registerCombatCommand("en_spiral_kick_1");
		core.commandService.registerCombatCommand("en_spiral_kick_2");
		core.commandService.registerCombatCommand("en_spiral_kick_3");
		core.commandService.registerCombatCommand("en_spiral_kick_4");
		core.commandService.registerCombatCommand("en_strike_0");
		core.commandService.registerCombatCommand("en_strike_1");
		core.commandService.registerCombatCommand("en_strike_2");
		core.commandService.registerCombatCommand("en_strike_3");
		core.commandService.registerCombatCommand("en_strike_4");
		core.commandService.registerCombatCommand("en_strike_5");
		core.commandService.registerCombatCommand("en_strike_6");
		core.commandService.registerCombatCommand("en_sweeping_pirouette_0");
		core.commandService.registerCombatCommand("en_sweeping_pirouette_1");
		core.commandService.registerCombatCommand("en_sweeping_pirouette_2");
		core.commandService.registerCombatCommand("en_sweeping_pirouette_3");
		core.commandService.registerCombatCommand("en_sweeping_pirouette_4");
		core.commandService.registerCombatCommand("en_sweeping_pirouette_5");
		core.commandService.registerCombatCommand("en_unhealthy_fixation");
		core.commandService.registerCombatCommand("en_void_dance");
		core.commandService.registerCombatCommand("en_void_dance_1");
		core.commandService.registerCombatCommand("en_void_dance_2");
		core.commandService.registerCombatCommand("en_void_dance_3");
		core.commandService.registerCombatCommand("en_sh_1");
		core.commandService.registerCombatCommand("en_sh_2");
		core.commandService.registerCombatCommand("en_sh_3");
		core.commandService.registerCombatCommand("en_heal_1");
		core.commandService.registerCombatCommand("en_heal_2");
		core.commandService.registerCombatCommand("en_heal_3");
		core.commandService.registerCombatCommand("en_heal_4");
		
		
		// Medic
		
		core.commandService.registerCombatCommand("me_ae_heal_1");
		core.commandService.registerCombatCommand("me_ae_heal_2");
		core.commandService.registerCombatCommand("me_ae_heal_3");
		core.commandService.registerCombatCommand("me_ae_heal_4");
		core.commandService.registerCombatCommand("me_ae_heal_5");
		core.commandService.registerCombatCommand("me_ae_heal_6");
		core.commandService.registerCombatCommand("me_bacta_ampule_1");
		core.commandService.registerCombatCommand("me_bacta_ampule_2");
		core.commandService.registerCombatCommand("me_bacta_ampule_3");
		core.commandService.registerCombatCommand("me_bacta_ampule_4");
		core.commandService.registerCombatCommand("me_bacta_ampule_5");
		core.commandService.registerCombatCommand("me_bacta_ampule_6");
		core.commandService.registerCombatCommand("me_bacta_bomb_1");
		core.commandService.registerCombatCommand("me_bacta_bomb_2");
		core.commandService.registerCombatCommand("me_bacta_bomb_3");
		core.commandService.registerCombatCommand("me_bacta_bomb_4");
		core.commandService.registerCombatCommand("me_bacta_bomb_5");
		core.commandService.registerCombatCommand("me_bacta_grenade_1");
		core.commandService.registerCombatCommand("me_bacta_grenade_2");
		core.commandService.registerCombatCommand("me_bacta_grenade_3");
		core.commandService.registerCombatCommand("me_bacta_grenade_4");
		core.commandService.registerCombatCommand("me_bacta_grenade_5");
		core.commandService.registerCombatCommand("me_bacta_resistance_1");
		core.commandService.registerCombatCommand("me_burst_1");
		core.commandService.registerCombatCommand("me_burst_2");
		core.commandService.registerCombatCommand("me_burst_3");
		core.commandService.registerCombatCommand("me_burst_4");
		core.commandService.registerCombatCommand("me_burst_5");
		core.commandService.registerCombatCommand("me_cranial_smash_1");
		core.commandService.registerCombatCommand("me_cranial_smash_2");
		core.commandService.registerCombatCommand("me_cranial_smash_3");
		core.commandService.registerCombatCommand("me_cranial_smash_4");
		core.commandService.registerCombatCommand("me_cranial_smash_5");
		core.commandService.registerCombatCommand("me_dm_1");
		core.commandService.registerCombatCommand("me_dm_2");
		core.commandService.registerCombatCommand("me_dm_3");
		core.commandService.registerCombatCommand("me_dm_4");
		core.commandService.registerCombatCommand("me_dm_5");
		core.commandService.registerCombatCommand("me_dm_6");
		core.commandService.registerCombatCommand("me_dm_8");
		core.commandService.registerCombatCommand("me_dm_dot_1");
		core.commandService.registerCombatCommand("me_dm_dot_2");
		core.commandService.registerCombatCommand("me_dm_dot_3");
		core.commandService.registerCombatCommand("me_dm_dot_4");
		core.commandService.registerCombatCommand("me_dm_dot_5");
		core.commandService.registerCombatCommand("me_dm_dot_6");
		core.commandService.registerCombatCommand("me_electrolyte_drain_1");
		core.commandService.registerCombatCommand("me_fld_dm_dot_1");
		core.commandService.registerCombatCommand("me_fld_dm_dot_2");
		core.commandService.registerCombatCommand("me_fld_dm_dot_3");
		core.commandService.registerCombatCommand("me_induce_insanity_1");
		core.commandService.registerCombatCommand("me_rv_area");
		core.commandService.registerCombatCommand("me_rv_combat");
		core.commandService.registerCombatCommand("me_rv_ooc");
		core.commandService.registerCombatCommand("me_rv_pvp_area");
		core.commandService.registerCombatCommand("me_rv_pvp_single");
		core.commandService.registerCombatCommand("me_serotonin_purge_1");
		core.commandService.registerCombatCommand("me_sh_1");
		core.commandService.registerCombatCommand("me_thyroid_rupture_1");
		core.commandService.registerCombatCommand("me_traumatize_1");
		core.commandService.registerCombatCommand("me_traumatize_2");
		core.commandService.registerCombatCommand("me_traumatize_3");
		core.commandService.registerCombatCommand("me_traumatize_4");
		core.commandService.registerCombatCommand("me_traumatize_5");
		core.commandService.registerCombatCommand("me_stasis_1");
		core.commandService.registerCommand("me_stasis_self_1");
		core.commandService.registerCommand("me_drag_1");
		core.commandService.registerCommand("me_reckless_stimulation_1");
		core.commandService.registerCommand("me_reckless_stimulation_2");
		core.commandService.registerCommand("me_reckless_stimulation_3");
		core.commandService.registerCommand("me_reckless_stimulation_4");
		core.commandService.registerCommand("me_reckless_stimulation_5");
		core.commandService.registerCommand("me_reckless_stimulation_6");
		
		// Officer
		
		core.commandService.registerCombatCommand("of_ae_dm_boss");
		core.commandService.registerCombatCommand("of_ae_dm_cc_1");
		core.commandService.registerCombatCommand("of_ae_dm_cc_2");
		core.commandService.registerCombatCommand("of_ae_dm_cc_3");
		core.commandService.registerCombatCommand("of_alt_ae_dm_1");
		core.commandService.registerCombatCommand("of_alt_ae_dm_2");
		core.commandService.registerCombatCommand("of_alt_ae_dm_3");
		core.commandService.registerCombatCommand("of_deb_def_1");
		core.commandService.registerCombatCommand("of_deb_def_2");
		core.commandService.registerCombatCommand("of_deb_def_3");
		core.commandService.registerCombatCommand("of_deb_def_4");
		core.commandService.registerCombatCommand("of_deb_def_5");
		core.commandService.registerCombatCommand("of_deb_def_6");
		core.commandService.registerCombatCommand("of_deb_def_7");
		core.commandService.registerCombatCommand("of_deb_def_8");
		core.commandService.registerCombatCommand("of_decapitate_1");
		core.commandService.registerCombatCommand("of_decapitate_2");
		core.commandService.registerCombatCommand("of_decapitate_3");
		core.commandService.registerCombatCommand("of_decapitate_4");
		core.commandService.registerCombatCommand("of_decapitate_5");
		core.commandService.registerCombatCommand("of_decapitate_6");
		core.commandService.registerCombatCommand("of_del_ae_dm_1");
		core.commandService.registerCombatCommand("of_del_ae_dm_2");
		core.commandService.registerCombatCommand("of_del_ae_dm_3");
		core.commandService.registerCombatCommand("of_del_ae_dm_boss");
		core.commandService.registerCombatCommand("of_del_ae_dm_dot_1");
		core.commandService.registerCombatCommand("of_del_ae_dm_dot_2");
		core.commandService.registerCombatCommand("of_del_ae_dm_dot_3");
		core.commandService.registerCombatCommand("of_del_ae_dot_1");
		core.commandService.registerCombatCommand("of_dm_1");
		core.commandService.registerCombatCommand("of_dm_2");
		core.commandService.registerCombatCommand("of_dm_3");
		core.commandService.registerCombatCommand("of_dm_4");
		core.commandService.registerCombatCommand("of_dm_5");
		core.commandService.registerCombatCommand("of_dm_6");
		core.commandService.registerCombatCommand("of_dm_7");
		core.commandService.registerCombatCommand("of_dm_8");
		core.commandService.registerCombatCommand("of_dm_boss");
		core.commandService.registerCombatCommand("of_leg_strike_1");
		core.commandService.registerCombatCommand("of_leg_strike_2");
		core.commandService.registerCombatCommand("of_leg_strike_3");
		core.commandService.registerCombatCommand("of_leg_strike_4");
		core.commandService.registerCombatCommand("of_leg_strike_5");
		core.commandService.registerCombatCommand("of_leg_strike_6");
		core.commandService.registerCombatCommand("of_leg_strike_7");
		core.commandService.registerCombatCommand("of_pistol_bleed");
		core.commandService.registerCombatCommand("of_pistol_dm");
		core.commandService.registerCombatCommand("of_sh_0");
		core.commandService.registerCombatCommand("of_sh_1");
		core.commandService.registerCombatCommand("of_sh_2");
		core.commandService.registerCombatCommand("of_sh_3");
		core.commandService.registerCombatCommand("of_vortex_1");
		core.commandService.registerCombatCommand("of_vortex_2");
		core.commandService.registerCombatCommand("of_vortex_3");
		core.commandService.registerCombatCommand("of_vortex_4");
		core.commandService.registerCombatCommand("of_vortex_5");
		
		// Smuggler
		
		core.commandService.registerCombatCommand("sm_ae_cover_fire");
		core.commandService.registerCombatCommand("sm_ae_dm_1");
		core.commandService.registerCombatCommand("sm_ae_dm_2");
		core.commandService.registerCombatCommand("sm_ae_dm_3");
		core.commandService.registerCombatCommand("sm_ae_dm_4");
		core.commandService.registerCombatCommand("sm_ae_dm_5");
		core.commandService.registerCombatCommand("sm_ae_dm_6");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_1");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_2");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_3");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_4");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_5");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_melee_1");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_melee_2");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_melee_3");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_melee_4");
		core.commandService.registerCombatCommand("sm_ae_dm_cc_melee_5");
		core.commandService.registerCombatCommand("sm_ae_dm_melee_1");
		core.commandService.registerCombatCommand("sm_ae_dm_melee_2");
		core.commandService.registerCombatCommand("sm_ae_dm_melee_3");
		core.commandService.registerCombatCommand("sm_ae_dm_melee_4");
		core.commandService.registerCombatCommand("sm_ae_dm_melee_5");
		core.commandService.registerCombatCommand("sm_ae_dm_melee_6");
		core.commandService.registerCombatCommand("sm_ae_pin_down");
		core.commandService.registerCombatCommand("sm_bad_odds_1");
		core.commandService.registerCombatCommand("sm_bad_odds_2");
		core.commandService.registerCombatCommand("sm_bad_odds_3");
		core.commandService.registerCombatCommand("sm_bad_odds_4");
		core.commandService.registerCombatCommand("sm_bad_odds_5");
		core.commandService.registerCombatCommand("sm_break_the_deal");
		core.commandService.registerCombatCommand("sm_concussion_shot");
		core.commandService.registerCombatCommand("sm_del_dm_cc_1");
		core.commandService.registerCombatCommand("sm_del_dm_cc_2");
		core.commandService.registerCombatCommand("sm_del_dm_cc_3");
		core.commandService.registerCombatCommand("sm_del_dm_cc_4");
		core.commandService.registerCombatCommand("sm_del_dm_cc_5");
		core.commandService.registerCombatCommand("sm_del_dm_cc_6");
		core.commandService.registerCombatCommand("sm_dizzy");
		core.commandService.registerCombatCommand("sm_dm_1");
		core.commandService.registerCombatCommand("sm_dm_2");
		core.commandService.registerCombatCommand("sm_dm_3");
		core.commandService.registerCombatCommand("sm_dm_4");
		core.commandService.registerCombatCommand("sm_dm_5");
		core.commandService.registerCombatCommand("sm_dm_6");
		core.commandService.registerCombatCommand("sm_dm_7");
		core.commandService.registerCombatCommand("sm_dm_cc_1");
		core.commandService.registerCombatCommand("sm_dm_cc_2");
		core.commandService.registerCombatCommand("sm_dm_cc_3");
		core.commandService.registerCombatCommand("sm_dm_cc_4");
		core.commandService.registerCombatCommand("sm_dm_cc_5");
		core.commandService.registerCombatCommand("sm_dm_cc_6");
		core.commandService.registerCombatCommand("sm_dm_cc_melee_1");
		core.commandService.registerCombatCommand("sm_dm_cc_melee_2");
		core.commandService.registerCombatCommand("sm_dm_cc_melee_3");
		core.commandService.registerCombatCommand("sm_dm_cc_melee_4");
		core.commandService.registerCombatCommand("sm_dm_cc_melee_5");
		core.commandService.registerCombatCommand("sm_dm_cc_melee_6");
		core.commandService.registerCombatCommand("sm_dm_dot_1");
		core.commandService.registerCombatCommand("sm_dm_dot_2");
		core.commandService.registerCombatCommand("sm_dm_dot_3");
		core.commandService.registerCombatCommand("sm_dm_dot_4");
		core.commandService.registerCombatCommand("sm_dm_dot_melee_1");
		core.commandService.registerCombatCommand("sm_dm_dot_melee_2");
		core.commandService.registerCombatCommand("sm_dm_dot_melee_3");
		core.commandService.registerCombatCommand("sm_dm_dot_melee_4");
		core.commandService.registerCombatCommand("sm_dm_melee_1");
		core.commandService.registerCombatCommand("sm_dm_melee_2");
		core.commandService.registerCombatCommand("sm_dm_melee_3");
		core.commandService.registerCombatCommand("sm_dm_melee_4");
		core.commandService.registerCombatCommand("sm_dm_melee_5");
		core.commandService.registerCombatCommand("sm_dm_melee_6");
		core.commandService.registerCombatCommand("sm_dm_melee_7");
		core.commandService.registerCombatCommand("sm_false_hope");
		core.commandService.registerCombatCommand("sm_fast_draw");
		core.commandService.registerCombatCommand("sm_how_are_you");
		core.commandService.registerCombatCommand("sm_impossible_odds");
		core.commandService.registerCombatCommand("sm_inspect_cargo");
		core.commandService.registerCombatCommand("sm_pistol_whip_1");
		core.commandService.registerCombatCommand("sm_pistol_whip_2");
		core.commandService.registerCombatCommand("sm_pistol_whip_3");
		core.commandService.registerCombatCommand("sm_pistol_whip_4");
		core.commandService.registerCombatCommand("sm_precision_strike");
		core.commandService.registerCombatCommand("sm_sh_0");
		core.commandService.registerCombatCommand("sm_sh_1");
		core.commandService.registerCombatCommand("sm_sh_2");
		core.commandService.registerCombatCommand("sm_sh_3");
		core.commandService.registerCombatCommand("sm_shoot_first_1");
		core.commandService.registerCombatCommand("sm_shoot_first_2");
		core.commandService.registerCombatCommand("sm_shoot_first_3");
		core.commandService.registerCombatCommand("sm_shoot_first_4");
		core.commandService.registerCombatCommand("sm_shoot_first_5");
		core.commandService.registerCombatCommand("sm_skullduggery");
		core.commandService.registerCombatCommand("sm_sly_lie");
		core.commandService.registerCombatCommand("sm_spot_a_sucker_1");
		core.commandService.registerCombatCommand("sm_spot_a_sucker_2");
		core.commandService.registerCombatCommand("sm_spot_a_sucker_3");
		core.commandService.registerCombatCommand("sm_spot_a_sucker_4");

		
		// Spy
		
		core.commandService.registerCombatCommand("sp_action_regen");
		core.commandService.registerCombatCommand("sp_assassins_mark");
		core.commandService.registerCombatCommand("sp_cc_dot");
		core.commandService.registerCombatCommand("sp_dm_1");
		core.commandService.registerCombatCommand("sp_dm_2");
		core.commandService.registerCombatCommand("sp_dm_3");
		core.commandService.registerCombatCommand("sp_dm_4");
		core.commandService.registerCombatCommand("sp_dm_5");
		core.commandService.registerCombatCommand("sp_dm_6");
		core.commandService.registerCombatCommand("sp_dm_7");
		core.commandService.registerCombatCommand("sp_dm_8");
		core.commandService.registerCombatCommand("sp_dot_0");
		core.commandService.registerCombatCommand("sp_dot_1");
		core.commandService.registerCombatCommand("sp_dot_2");
		core.commandService.registerCombatCommand("sp_dot_3");
		core.commandService.registerCombatCommand("sp_dot_4");
		core.commandService.registerCombatCommand("sp_dot_5");
		core.commandService.registerCombatCommand("sp_fld_debuff_ca");
		core.commandService.registerCombatCommand("sp_fldmot_1");
		core.commandService.registerCombatCommand("sp_fldmot_1_snare");
		core.commandService.registerCombatCommand("sp_fldmot_2");
		core.commandService.registerCombatCommand("sp_fldmot_2_snare");
		core.commandService.registerCombatCommand("sp_fldmot_3");
		core.commandService.registerCombatCommand("sp_fldmot_3_snare");
		core.commandService.registerCombatCommand("sp_hd_melee_0");
		core.commandService.registerCombatCommand("sp_hd_melee_1");
		core.commandService.registerCombatCommand("sp_hd_melee_2");
		core.commandService.registerCombatCommand("sp_hd_melee_3");
		core.commandService.registerCombatCommand("sp_hd_melee_4");
		core.commandService.registerCombatCommand("sp_hd_melee_5");
		core.commandService.registerCombatCommand("sp_hd_melee_6");
		core.commandService.registerCombatCommand("sp_hd_range_0");
		core.commandService.registerCombatCommand("sp_hd_range_1");
		core.commandService.registerCombatCommand("sp_hd_range_2");
		core.commandService.registerCombatCommand("sp_hd_range_3");
		core.commandService.registerCombatCommand("sp_hd_range_4");
		core.commandService.registerCombatCommand("sp_hd_range_5");
		core.commandService.registerCombatCommand("sp_hd_range_6");
		core.commandService.registerCombatCommand("sp_improved_cc_dot_0");
		core.commandService.registerCombatCommand("sp_improved_cc_dot_1");
		core.commandService.registerCombatCommand("sp_improved_cc_dot_2");
		core.commandService.registerCombatCommand("sp_improved_cc_dot_3");
		core.commandService.registerCombatCommand("sp_run_its_course");
		core.commandService.registerCombatCommand("sp_sh_0");
		core.commandService.registerCombatCommand("sp_sh_1");
		core.commandService.registerCombatCommand("sp_sh_2");
		core.commandService.registerCombatCommand("sp_sh_3");
		core.commandService.registerCombatCommand("sp_shifty_setup");
		core.commandService.registerCombatCommand("sp_stealth_melee_0");
		core.commandService.registerCombatCommand("sp_stealth_melee_1");
		core.commandService.registerCombatCommand("sp_stealth_melee_2");
		core.commandService.registerCombatCommand("sp_stealth_melee_3");
		core.commandService.registerCombatCommand("sp_stealth_melee_4");
		core.commandService.registerCombatCommand("sp_stealth_melee_5");
		core.commandService.registerCombatCommand("sp_stealth_melee_6");
		core.commandService.registerCombatCommand("sp_stealth_ranged_0");
		core.commandService.registerCombatCommand("sp_stealth_ranged_1");
		core.commandService.registerCombatCommand("sp_stealth_ranged_2");
		core.commandService.registerCombatCommand("sp_stealth_ranged_3");
		core.commandService.registerCombatCommand("sp_stealth_ranged_4");
		core.commandService.registerCombatCommand("sp_stealth_ranged_5");
		core.commandService.registerCombatCommand("sp_stealth_ranged_6");
		

		

		
	}

}
