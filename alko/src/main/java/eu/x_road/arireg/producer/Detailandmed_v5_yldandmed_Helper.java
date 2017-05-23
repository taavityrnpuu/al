/**
 * Detailandmed_v5_yldandmed_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_yldandmed_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Detailandmed_v5_yldandmed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_yldandmed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettevotteregistri_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotteregistri_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esmaregistreerimise_kpv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esmaregistreerimise_kpv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kustutamise_kpv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamise_kpv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "staatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staatus_tekstina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "staatus_tekstina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piirkond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "piirkond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piirkond_tekstina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "piirkond_tekstina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piirkond_tekstina_pikk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "piirkond_tekstina_pikk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegutseb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "tegutseb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegutseb_tekstina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "tegutseb_tekstina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mkr_reg_kpv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mkr_reg_kpv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_mkrreg_kuupaev"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raamatupidamiskohustused");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "raamatupidamiskohustused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_raamatupidamiskohustus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ettevotja_tegevuse_aeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_tegevuse_aeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teg_aeg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evks_registreeritud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evks_registreeritud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evks_registreeritud_kande_kpv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evks_registreeritud_kande_kpv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oiguslik_vorm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oiguslik_vorm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oiguslik_vorm_nr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oiguslik_vorm_nr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oiguslik_vorm_tekstina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oiguslik_vorm_tekstina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oigusliku_vormi_alaliik");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oigusliku_vormi_alaliik"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oigusliku_vormi_alaliik_tekstina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oigusliku_vormi_alaliik_tekstina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundlopetamine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sundlopetamine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_sundlopetamine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staatused");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "staatused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_staatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valismaa_ariyhing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "valismaa_ariyhing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_valismaa_ariyhing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arinimed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "arinimed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_arinimi"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aadressid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aadressid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aadress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kinnisasjad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kinnisasjad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kinnisasi"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oiguslikud_vormid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oiguslikud_vormid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oiguslik_vorm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oigusliku_vormi_alaliigid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oigusliku_vormi_alaliigid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusliku_vormi_alaliik"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kapitalid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kapitalid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kapital"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nimivaartuseta_aktsiad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "nimivaartuseta_aktsiad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_nimivaartusetaaktsia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oigusjargsused");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "oigusjargsused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusjargsus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seisundi_muutused");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seisundi_muutused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_seisundi_muutus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majandusaastad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaastad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_majandusaasta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pohikirjad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "pohikirjad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pohikiri"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kompromissi_tahtajad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kompromissi_tahtajad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kompromissi_tahtaeg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asutamise_ajad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "asutamise_ajad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_asutamise_aeg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegutsemise_tahtajad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "tegutsemise_tahtajad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegutsemise_tahtaeg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esmanimetamise_ajad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esmanimetamise_ajad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esmanimetamise_aeg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markused_kaardil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "markused_kaardil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_markus_kaardil"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tegevusalad_kaardil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "tegevusalad_kaardil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegevusala_kaardil"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eesmargid_kaardil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "eesmargid_kaardil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_eesmark_kaardil"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidevahendid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sidevahendid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_sidevahend"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teatatud_tegevusalad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "teatatud_tegevusalad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teatatud_tegevusala"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info_majandusaasta_aruannetest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "info_majandusaasta_aruannetest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aruande_info"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asutatud_sissemakset_tegemata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "asutatud_sissemakset_tegemata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("on_raamatupidamiskohustuslane");
        elemField.setXmlName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "on_raamatupidamiskohustuslane"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
