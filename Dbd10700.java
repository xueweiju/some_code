package jp.go.jhf.sols.core.service.batch.dtys;

import static jp.co.tis.c2j.CONST.HIGH_VALUE;
import static jp.co.tis.c2j.CONST.SPACE;
import static jp.co.tis.c2j.CONST.ZERO;
import static jp.co.tis.c2j.enumeration.PIC_SV.S;
import static jp.co.tis.c2j.enumeration.USAGE.BIT;
import static jp.co.tis.c2j.enumeration.USAGE.COMP;
import static jp.co.tis.c2j.enumeration.USAGE.COMP3;
import jp.co.tis.c2j.CBool;
import jp.co.tis.c2j.CData;
import jp.co.tis.c2j.CFile;
import jp.co.tis.c2j.CGrp;
import jp.co.tis.c2j.CInt;
import jp.co.tis.c2j.CLong;
import jp.co.tis.c2j.CNStr;
import jp.co.tis.c2j.CRecord;
import jp.co.tis.c2j.CXStr;
import jp.co.tis.c2j.CblBase;
import jp.co.tis.c2j.ExitProgramException;
import jp.co.tis.c2j.StopRunException;
import jp.co.tis.c2j.parameter.ParamSetReference;
import jp.go.jhf.sols.core.dto.acezl101.CバッチテーブルＰＫＴＣ;
import jp.go.jhf.sols.core.dto.afdb1020.C団地_分割入力年月日;
import jp.go.jhf.sols.core.dto.afdb1020.C団地_分割情報入力年月日;
import jp.go.jhf.sols.core.dto.afdb1020.C団地_貸付期限年月日;
import jp.go.jhf.sols.core.dto.apa5004.Cジョブメッセージ送出ＰＫＴ;
import jp.go.jhf.sols.core.dto.apyl100.CＢＴＢＬ共通ＰＫＴ;
import jp.go.jhf.sols.core.dto.apyl101.CバッチテーブルＰＫＴ;
import jp.go.jhf.sols.core.dto.apyl101a.CバッチテーブルＲＴＮ;
import jp.go.jhf.sols.core.dto.apyl101b.Cバッチテーブル依頼;
import jp.go.jhf.sols.core.dto.apyl101c.CバッチテーブルＲＴＮ詳細;
import jp.go.jhf.sols.core.dto.ata01000.C金融機関テーブル;

/**
 * Dbd10700<BR>
 * 団地バッチ処理用Ｆ作成<BR>
 * <BR>
 * 債権ＭＲファイルのオンライン処理後抽出ファイルと団体融資ＴＲファイルのオンライン処理後抽出ファイルと物件ＴＲ団体ファイルのオンライン処理後抽出ファ<BR>
 * イルを入力してバッチ処理用Ｆを作成する。<BR>
 * <BR>
 * @author TIS C2J_1.0.0
 * @since 1.0.0
 */
public class Dbd10700 extends CblBase implements ParamSetReference {

    /**
     * Dbd10700のmainメソッド
     *
     * @param args 実行時の引数
     */
    public static void main(String[] args) {

        Dbd10700 pgm = new Dbd10700();
        pgm.setParm(args);
        try {
            pgm.execute();
            pgm.writeReturnCode();
        } catch (StopRunException ex) {
            pgm.writeReturnCode();
        } catch (ExitProgramException ex) {
            pgm.writeReturnCode();
        } catch (Exception ex) {
            pgm.writeReturnCode();
            throw ex;
        }

    }

    // ## FILE SECTION START ##
    public class C債権ＭＲレコード extends CRecord {
        public C債権ＭＲレコード() {
            initBuffer();
        }

        public C債権ＭＲレコード(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY AFAA0000
        public jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部 バッチ共通制御部 = new jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部();
        // COPY AFE09000
        public jp.go.jhf.sols.core.dto.afe09000.C債権ＭＲ 債権ＭＲ = new jp.go.jhf.sols.core.dto.afe09000.C債権ＭＲ();
        // COPY AFB01000
        public jp.go.jhf.sols.core.dto.afb01000.C債権基本ＭＲ 債権基本ＭＲ = new jp.go.jhf.sols.core.dto.afb01000.C債権基本ＭＲ();
    }

    public C債権ＭＲレコード 債権ＭＲレコード = new C債権ＭＲレコード();

    public class C物件ＴＲ団体レコード extends CRecord {
        public C物件ＴＲ団体レコード() {
            initBuffer();
        }

        public C物件ＴＲ団体レコード(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY AFAA0000
        public jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部 バッチ共通制御部 = new jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部();
        // COPY AFD24000
        public jp.go.jhf.sols.core.dto.afd24000.C物件ＴＲ団体 物件ＴＲ団体 = new jp.go.jhf.sols.core.dto.afd24000.C物件ＴＲ団体();
    }

    public C物件ＴＲ団体レコード 物件ＴＲ団体レコード = new C物件ＴＲ団体レコード();

    public class C団体融資ＴＲレコード extends CRecord {
        public C団体融資ＴＲレコード() {
            initBuffer();
        }

        public C団体融資ＴＲレコード(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY AFAA0000
        public jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部 バッチ共通制御部 = new jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部();
        // COPY AFD26000
        public jp.go.jhf.sols.core.dto.afd26000.C団体融資ＴＲ 団体融資ＴＲ = new jp.go.jhf.sols.core.dto.afd26000.C団体融資ＴＲ();
    }

    public C団体融資ＴＲレコード 団体融資ＴＲレコード = new C団体融資ＴＲレコード();

    public class C団地レコード extends CRecord {
        public C団地レコード() {
            initBuffer();
        }

        public C団地レコード(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY AFDB1020
        public jp.go.jhf.sols.core.dto.afdb1020.C団地キー 団地キー = new jp.go.jhf.sols.core.dto.afdb1020.C団地キー();
        public jp.go.jhf.sols.core.dto.afdb1020.C旧団地キー 旧団地キー = new jp.go.jhf.sols.core.dto.afdb1020.C旧団地キー();
        public CXStr 団地_レコド削除フラグ = CXStr(1);
        public CXStr 団地_プロジェクトコード = CXStr(4);
        public CNStr 団地_プロジェクト名 = CNStr(20);
        public CXStr 団地_新規継続 = CXStr(1);
        public CXStr 団地_委託区分 = CXStr(1);
        public CNStr 団地_団地名漢字 = CNStr(30);
        public CXStr 団地_建設地コード = CXStr(6);
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_建設地住所 団地_建設地住所 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_建設地住所();
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_算定情報 団地_算定情報 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_算定情報();
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_区分_購入 団地_区分_購入 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_区分_購入();
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_件数 団地_件数 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_件数();
        public CXStr 団地_事業主体コード = CXStr(4);
        public CNStr 団地_申込者名 = CNStr(13);
        public CNStr 団地_申込者名２ = CNStr(28);
        public CNStr 団地_融資種別名 = CNStr(6);
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_金融機関 団地_金融機関 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_金融機関();
        public CXStr 団地_広域用支店コード = CXStr(2);
        public CXStr 団地_広域用整理番号 = CXStr(8);
        public CInt 団地_機関保証コード = CInt(1);
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_事前協議 団地_事前協議 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_事前協議();
        public jp.go.jhf.sols.core.dto.afdb1020.C団地_工事施行予定業者 団地_工事施行予定業者 = new jp.go.jhf.sols.core.dto.afdb1020.C団地_工事施行予定業者();
        public CXStr 団地_顧客番号証貸 = CXStr(15);
        public CLong 団地_資金交付済額取得 = CLong(11, S, COMP3);
        public CLong 団地_償還済貸付金取得 = CLong(11, S, COMP3);
        public CInt 団地_債権分類コード = CInt(3);
        public C団地_貸付期限年月日 団地_貸付期限年月日 = new C団地_貸付期限年月日();
        public CLong 団地_振替償還顧客番号 = CLong(17);
        public CInt 団地_振替償還区分 = CInt(2);
        public C団地_分割情報入力年月日 団地_分割情報入力年月日 = new C団地_分割情報入力年月日();
        public C団地_分割入力年月日 団地_分割入力年月日 = new C団地_分割入力年月日();
        public CInt 団地_債権分割 = CInt(1);
        public CInt 団地_融資種別コード = CInt(4);
        public CXStr 団地_委託区分現場 = CXStr(1);
        public CXStr 団地_民間機関設計 = CXStr(4);
        public CXStr 団地_民間機関現場 = CXStr(4);
        public CXStr 団地_差引フラグ = CXStr(1);
        public CInt 団地_差引機関保証料 = CInt(9);
        public CXStr 団地_完了年度 = CXStr(4);
        public CInt 団地_償還方法 = CInt(1);
        public CInt 団地_任意入力保証料率 = CInt(4, S, COMP3);
        public CInt 団地_保証料返戻の有無 = CInt(1);
    }

    public C団地レコード 団地レコード = new C団地レコード();

    // ## FILE SECTION END ##
    // ## WORKING-STORAGE SECTION START ##
    public class CＷＫ_ジョブメッセージ extends CGrp {
        public CＷＫ_ジョブメッセージ() {
            initBuffer();
        }

        public CＷＫ_ジョブメッセージ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CNStr ＷＫ_処理名 = CNStr(15).VALUE("団地バッチ処理用ファイル作成　");
    }

    public CＷＫ_ジョブメッセージ ＷＫ_ジョブメッセージ = new CＷＫ_ジョブメッセージ();
    public CXStr ＣＳＴ_入力 = new CXStr(3).VALUE("IN ");
    public CXStr ＣＳＴ_出力 = new CXStr(3).VALUE("OUT");
    public CXStr ＣＳＴ_プログラムＩＤ = new CXStr(8).VALUE("DBD10700");
    public CXStr ＣＳＴ_ＤＤ名１ = new CXStr(8).VALUE("DDD107I1");
    public CXStr ＣＳＴ_ＤＤ名２ = new CXStr(8).VALUE("DDD107I2");
    public CXStr ＣＳＴ_ＤＤ名３ = new CXStr(8).VALUE("DDD107I3");
    public CXStr ＣＳＴ_ＤＤ名１０ = new CXStr(8).VALUE("DDD107O1");

    public class CＣＳＴ_メッセージ extends CGrp {
        public CＣＳＴ_メッセージ() {
            initBuffer();
        }

        public CＣＳＴ_メッセージ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CXStr 情報メッセージ = CXStr(1).VALUE("I");
        public CXStr エラメッセージ = CXStr(1).VALUE("E");
        public CLong 準定型メッセージ = CLong(15, COMP3).VALUE(2L);
        public CLong 件数_データ長 = CLong(15, COMP3).VALUE(27L);

        public class CメッセージＮＯ extends CGrp {
            public CLong 件数表示ＮＯ = CLong(15, COMP3).VALUE(1304L);
        }

        public CメッセージＮＯ メッセージＮＯ = new CメッセージＮＯ();
    }

    public CＣＳＴ_メッセージ ＣＳＴ_メッセージ = new CＣＳＴ_メッセージ();

    public class CＷＫ_ジョブパラ extends CGrp {
        public CＷＫ_ジョブパラ() {
            initBuffer();
        }

        public CＷＫ_ジョブパラ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APA5004
        public Cジョブメッセージ送出ＰＫＴ ジョブメッセージ送出ＰＫＴ = new Cジョブメッセージ送出ＰＫＴ();
    }

    public CＷＫ_ジョブパラ ＷＫ_ジョブパラ = new CＷＫ_ジョブパラ();

    public class C基本メッセージ領域 extends CGrp {
        public C基本メッセージ領域() {
            initBuffer();
        }

        public C基本メッセージ領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYJ000
        public jp.go.jhf.sols.core.dto.apyj000.C共通基本パラメータ域 共通基本パラメータ域 = new jp.go.jhf.sols.core.dto.apyj000.C共通基本パラメータ域();
    }

    public C基本メッセージ領域 基本メッセージ領域 = new C基本メッセージ領域();

    public class Cメッセージ作成領域 extends CGrp {
        public Cメッセージ作成領域() {
            initBuffer();
        }

        public Cメッセージ作成領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYJ441
        public jp.go.jhf.sols.core.dto.apyj441.Cメッセージエリア メッセージエリア = new jp.go.jhf.sols.core.dto.apyj441.Cメッセージエリア();
    }

    public Cメッセージ作成領域 メッセージ作成領域 = new Cメッセージ作成領域();

    public class CＷＫ_メッセージ領域 extends CGrp {
        public CＷＫ_メッセージ領域() {
            initBuffer();
        }

        public CＷＫ_メッセージ領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APA50031
        public jp.go.jhf.sols.core.dto.apa50031.Cメッセージエリア メッセージエリア = new jp.go.jhf.sols.core.dto.apa50031.Cメッセージエリア();
    }

    public CＷＫ_メッセージ領域 ＷＫ_メッセージ領域 = new CＷＫ_メッセージ領域();

    public class CＦＬＧ_エリア extends CGrp {
        public CＦＬＧ_エリア() {
            initBuffer();
        }

        public CＦＬＧ_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CXStr ＦＬＧ_オン = CXStr(1).VALUE("1");
        public CXStr ＦＬＧ_オフ = CXStr(1).VALUE("0");
        public CXStr ＦＬＧ_終了 = CXStr(1).VALUE("0");
        public CXStr ＦＬＧ_債権ＭＲ = CXStr(1).VALUE("0");
        public CXStr ＦＬＧ_団体融資ＴＲ = CXStr(1).VALUE("0");
        public CXStr ＦＬＧ_物件ＴＲ団体 = CXStr(1).VALUE("0");
    }

    public CＦＬＧ_エリア ＦＬＧ_エリア = new CＦＬＧ_エリア();

    public class CＣＮＴ_エリア extends CGrp {
        public CＣＮＴ_エリア() {
            initBuffer();
        }

        public CＣＮＴ_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CLong ＣＮＴ_債権ＭＲ = CLong(10, COMP).VALUE(ZERO);
        public CLong ＣＮＴ_団体融資ＴＲ = CLong(10, COMP).VALUE(ZERO);
        public CLong ＣＮＴ_物件ＴＲ団体 = CLong(10, COMP).VALUE(ZERO);
        public CLong ＣＮＴ_団地 = CLong(10, COMP).VALUE(ZERO);
    }

    public CＣＮＴ_エリア ＣＮＴ_エリア = new CＣＮＴ_エリア();
    public CLong ＷＫ_更新通番 = new CLong(11);

    public class CＷＫ_更新通番１ extends CGrp {
        public CＷＫ_更新通番１(CData ＷＫ_更新通番) {
            setRedefines(ＷＫ_更新通番);
            initBuffer();
        }

        public CInt ＷＫ_支店コード = CInt(2);
        public CInt ＷＫ_申込年度 = CInt(1);
        public CInt ＷＫ_種別分類コード = CInt(1);
        public CInt ＷＫ_連番 = CInt(4);
        public CInt ＷＫ_枝番 = CInt(2);
        public CInt ＷＫ_レコド削除フラグ = CInt(1);
    }

    public CＷＫ_更新通番１ ＷＫ_更新通番１ = new CＷＫ_更新通番１(ＷＫ_更新通番);

    public class CＷＫ_エリア extends CGrp {
        public CＷＫ_エリア() {
            initBuffer();
        }

        public CＷＫ_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CInt ＷＫ_プロジェクトコード = CInt(4);
        public CInt ＷＫ_新規継続 = CInt(1);
        public CInt ＷＫ_委託区分 = CInt(1);
        public CInt ＷＫ_事業主体コード = CInt(7);
        public CInt ＷＫ_建物 = CInt(1);
        public CInt ＷＫ_土地 = CInt(1);
        public CInt ＷＫ_マンション = CInt(1);
        public CInt ＷＫ_三大都市圏等区分 = CInt(1);
        public CInt ＷＫ_距離帯別地域区分 = CInt(2);
        public CInt ＷＫ_購入_建物 = CInt(1);
        public CInt ＷＫ_購入_土地 = CInt(1);
        public CInt ＷＫ_購入_マンション = CInt(1);
        public CInt ＷＫ_事前協議 = CInt(6);
        public CInt ＷＫ_建設地コード = CInt(6);
        public CInt ＷＫ_建設金融機関コード = CInt(4);
        public CInt ＷＫ_購入金融機関コード = CInt(4);
        public CInt ＷＫ_ＣＩＦ番号 = CInt(8);
        public CInt ＷＫ_エントリレコードキー = CInt(8);

        public class CＷＫ_顧客番号 extends CGrp {
            public CLong ＷＫ_顧客番号９ = CLong(17);
        }

        public CＷＫ_顧客番号 ＷＫ_顧客番号 = new CＷＫ_顧客番号();
        public CInt ＷＫ_広域用支店コード = CInt(2);
        public CInt ＷＫ_債権分類コード = CInt(3);
        public CInt ＷＫ_管轄支店コード = CInt(2);
        public CXStr Ｗ公庫ＦＬＧ = CXStr(1);
        public CInt IX1 = CInt(2);
        public CInt ＷＫ_貸付期限年月日 = CInt(8);
        public CLong ＷＫ_振替償還顧客番号 = CLong(17);
        public CInt ＷＫ_振替償還区分 = CInt(2);
        public CInt ＷＫ_融資種別コード = CInt(4);
        public CInt ＷＫ_委託区分現場 = CInt(1);
        public CInt ＷＫ_差引フラグ = CInt(1);
        public CInt ＷＫ_完了年度 = CInt(4);
        public CInt ＷＫ_分割情報入力年月日 = CInt(8);
        public CInt ＷＫ_分割入力年月日 = CInt(8);
        public CInt ＷＫ_債権分割 = CInt(1);
        public CInt ＷＫ_償還方法 = CInt(1);
        public CInt ＷＫ_保証料返戻の有無 = CInt(1);
    }

    public CＷＫ_エリア ＷＫ_エリア = new CＷＫ_エリア();

    public class C広域支店修正ワーク extends CGrp {
        public C広域支店修正ワーク() {
            initBuffer();
        }

        public C広域支店修正ワーク(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CInt ＷＫテーブル広域支店 = CInt(2);
    }

    public C広域支店修正ワーク 広域支店修正ワーク = new C広域支店修正ワーク();

    public class Cバッチ異常終了領域 extends CGrp {
        public Cバッチ異常終了領域() {
            initBuffer();
        }

        public Cバッチ異常終了領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APA5003
        public jp.go.jhf.sols.core.dto.apa5003.Cバッチ異常終了ＰＫＴ バッチ異常終了ＰＫＴ = new jp.go.jhf.sols.core.dto.apa5003.Cバッチ異常終了ＰＫＴ();
    }

    public Cバッチ異常終了領域 バッチ異常終了領域 = new Cバッチ異常終了領域();

    public class C異常事象メッセージ領域 extends CGrp {
        public C異常事象メッセージ領域() {
            initBuffer();
        }

        public C異常事象メッセージ領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APA50031
        public jp.go.jhf.sols.core.dto.apa50031.Cメッセージエリア メッセージエリア = new jp.go.jhf.sols.core.dto.apa50031.Cメッセージエリア();
    }

    public C異常事象メッセージ領域 異常事象メッセージ領域 = new C異常事象メッセージ領域();

    public class CＷＫ_埋込メッセージ領域 extends CGrp {
        public CＷＫ_埋込メッセージ領域() {
            initBuffer();
        }

        public CＷＫ_埋込メッセージ領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CXStr ＷＫ_制御文字１ = CXStr(1);
        public CNStr ＷＫ_メッセージ = CNStr(15);
        public CXStr ＷＫ_制御文字２ = CXStr(1);
    }

    public CＷＫ_埋込メッセージ領域 ＷＫ_埋込メッセージ領域 = new CＷＫ_埋込メッセージ領域();

    public class Cジョブ異常終了メッセージ領域 extends CGrp {
        public Cジョブ異常終了メッセージ領域() {
            initBuffer();
        }

        public Cジョブ異常終了メッセージ領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APA50031
        public jp.go.jhf.sols.core.dto.apa50031.Cメッセージエリア メッセージエリア = new jp.go.jhf.sols.core.dto.apa50031.Cメッセージエリア();
    }

    public Cジョブ異常終了メッセージ領域 ジョブ異常終了メッセージ領域 = new Cジョブ異常終了メッセージ領域();

    public class Cコンスタント_エリア extends CGrp {
        public Cコンスタント_エリア() {
            initBuffer();
        }

        public Cコンスタント_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CLong ＣＳＴ_完了０３９１ = CLong(15, COMP3).VALUE(391L);
        public CLong ＣＳＴ_異常１３０１ = CLong(15, COMP3).VALUE(1301L);
        public CLong ＣＳＴ_異常１３０２ = CLong(15, COMP3).VALUE(1302L);
        // change CharacterCode. Confirm next line
        public CXStr ＣＳＴシフトイン = CXStr(1).VALUE(new byte[] { (byte) 0x0E });
        // change CharacterCode. Confirm next line
        public CXStr ＣＳＴシフトアウト = CXStr(1).VALUE(new byte[] { (byte) 0x0F });

        public class CＣＳＴ_埋込メッセージエリア extends CGrp {
            public CNStr ＣＳＴ_埋込メッセージ = CNStr(16).VALUE("プロジェクトＦオープンエラー    ");
        }

        public CＣＳＴ_埋込メッセージエリア ＣＳＴ_埋込メッセージエリア = new CＣＳＴ_埋込メッセージエリア();
    }

    public Cコンスタント_エリア コンスタント_エリア = new Cコンスタント_エリア();

    public class CＷＫ_論理削除表示ーＧ extends CGrp {
        public CＷＫ_論理削除表示ーＧ() {
            initBuffer();
        }

        public CＷＫ_論理削除表示ーＧ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CBool ＷＫ_論理削除表示 = CBool(1, BIT).VALUE("1");
        public CBool FILLER = CBool(7, BIT).VALUE("0");
    }

    public CＷＫ_論理削除表示ーＧ ＷＫ_論理削除表示ーＧ = new CＷＫ_論理削除表示ーＧ();

    public class CＳＶ_エリア extends CGrp {
        public CＳＶ_エリア() {
            initBuffer();
        }

        public CＳＶ_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CInt ＳＶ_金融機関コード = CInt(4).VALUE(ZERO);
        public CNStr ＳＶ_金融機関名 = CNStr(15).VALUE(SPACE);
        public CNStr ＳＶ_金融機関略称名 = CNStr(10).VALUE(SPACE);
    }

    public CＳＶ_エリア ＳＶ_エリア = new CＳＶ_エリア();

    public class CＷＫ_金融機関エリア extends CGrp {
        public CＷＫ_金融機関エリア() {
            initBuffer();
        }

        public CＷＫ_金融機関エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CInt ＷＫ_金融機関コード = CInt(4).VALUE(ZERO);
        public CNStr ＷＫ_金融機関名 = CNStr(15).VALUE(SPACE);
        public CNStr ＷＫ_金融機関略称名 = CNStr(10).VALUE(SPACE);
    }

    public CＷＫ_金融機関エリア ＷＫ_金融機関エリア = new CＷＫ_金融機関エリア();
    public CLong 金融機関テーブルアクセスキー = new CLong(15);

    public class C金融機関テーブルアクセスキーＲ extends CGrp {
        public C金融機関テーブルアクセスキーＲ(CData 金融機関テーブルアクセスキー) {
            setRedefines(金融機関テーブルアクセスキー);
            initBuffer();
        }

        public CLong 金融機関ゼロ = CLong(11);
        public CInt 金融機関ＣＤ = CInt(4);
    }

    public C金融機関テーブルアクセスキーＲ 金融機関テーブルアクセスキーＲ = new C金融機関テーブルアクセスキーＲ(金融機関テーブルアクセスキー);

    public class CＰＪ検索 extends CGrp {
        public CＰＪ検索() {
            initBuffer();
        }

        public CＰＪ検索(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // ** C O P Y  S T A R T *** AFDK0530 1
        public class Cプロジェクトファイル検索処理インターフェース extends CGrp {
            public CXStr プ検_処理区分 = CXStr(5);

            public class Cプ検_検索キー extends CGrp {
                public CXStr プ検_プロジクトコド = CXStr(4);
            }

            public Cプ検_検索キー プ検_検索キー = new Cプ検_検索キー();

            public class Cプ検_業務エリア extends CGrp {
                public CXStr プ検_予備１ = CXStr(2);

                public class Cプ検_障害情報 extends CGrp {
                    public CXStr プ検_ファイル名 = CXStr(12);

                    public class Cプ検_エラーコード extends CGrp {
                        public CXStr プ検_エラー区分 = CXStr(1);
                        public CInt プ検_エラーナンバー = CInt(3);
                    }

                    public Cプ検_エラーコード プ検_エラーコード = new Cプ検_エラーコード();
                    public CXStr プ検_プログラム名 = CXStr(8);
                    public CXStr プ検_仕様命令 = CXStr(10);
                    public CXStr プ検_障害区分 = CXStr(1);
                }

                public Cプ検_障害情報 プ検_障害情報 = new Cプ検_障害情報();
                public CInt プ検_復帰コード = CInt(1);
                public CXStr プ検_予備２ = CXStr(8);
            }

            public Cプ検_業務エリア プ検_業務エリア = new Cプ検_業務エリア();
            public CXStr プ検_予備３ = CXStr(45);
        }

        public Cプロジェクトファイル検索処理インターフェース プロジェクトファイル検索処理インターフェース = new Cプロジェクトファイル検索処理インターフェース();
        // ** C O P Y  E N D *** AFDK0530 1
    }

    public CＰＪ検索 ＰＪ検索 = new CＰＪ検索();

    public class CプロジェクトＲ extends CGrp {
        public CプロジェクトＲ() {
            initBuffer();
        }

        public CプロジェクトＲ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // ** C O P Y  S T A R T *** AFDK0360 1
        public class C一般ファイル_プロジェクトファイル extends CGrp {
            public class CプＦ_プロジェクトキー extends CGrp {
                public CXStr プＦ_プロジェクトコド = CXStr(4);
            }

            public CプＦ_プロジェクトキー プＦ_プロジェクトキー = new CプＦ_プロジェクトキー();
            public CNStr プＦ_プロジェクト漢字 = CNStr(20);
            public CXStr プＦ_予備 = CXStr(36);
        }

        public C一般ファイル_プロジェクトファイル 一般ファイル_プロジェクトファイル = new C一般ファイル_プロジェクトファイル();
        // ** C O P Y  E N D *** AFDK0360 1
    }

    public CプロジェクトＲ プロジェクトＲ = new CプロジェクトＲ();

    public class CＢＴＢＬ共通ＰＫＴＡ extends CGrp {
        public CＢＴＢＬ共通ＰＫＴＡ() {
            initBuffer();
        }

        public CＢＴＢＬ共通ＰＫＴＡ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYL100
        public CＢＴＢＬ共通ＰＫＴ ＢＴＢＬ共通ＰＫＴ = new CＢＴＢＬ共通ＰＫＴ();
    }

    public CＢＴＢＬ共通ＰＫＴＡ ＢＴＢＬ共通ＰＫＴＡ = new CＢＴＢＬ共通ＰＫＴＡ();

    public class CバッチテーブルＰＫＴＡ extends CGrp {
        public CバッチテーブルＰＫＴＡ() {
            initBuffer();
        }

        public CバッチテーブルＰＫＴＡ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYL101
        public CバッチテーブルＰＫＴ バッチテーブルＰＫＴ = new CバッチテーブルＰＫＴ();
    }

    public CバッチテーブルＰＫＴＡ バッチテーブルＰＫＴＡ = new CバッチテーブルＰＫＴＡ();

    public class CバッチテーブルＰＫＴＣＡ extends CGrp {
        public CバッチテーブルＰＫＴＣＡ() {
            initBuffer();
        }

        public CバッチテーブルＰＫＴＣＡ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY ACEZL101
        public CバッチテーブルＰＫＴＣ バッチテーブルＰＫＴＣ = new CバッチテーブルＰＫＴＣ();
    }

    public CバッチテーブルＰＫＴＣＡ バッチテーブルＰＫＴＣＡ = new CバッチテーブルＰＫＴＣＡ();

    public class C金融機関テーブルＡ extends CGrp {
        public C金融機関テーブルＡ() {
            initBuffer();
        }

        public C金融機関テーブルＡ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY ATA01000
        public C金融機関テーブル 金融機関テーブル = new C金融機関テーブル();
    }

    public C金融機関テーブルＡ 金融機関テーブルＡ = new C金融機関テーブルＡ();

    public class CバッチテーブルＲＴＮＡ extends CGrp {
        public CバッチテーブルＲＴＮＡ() {
            initBuffer();
        }

        public CバッチテーブルＲＴＮＡ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYL101A
        public CバッチテーブルＲＴＮ バッチテーブルＲＴＮ = new CバッチテーブルＲＴＮ();
    }

    public CバッチテーブルＲＴＮＡ バッチテーブルＲＴＮＡ = new CバッチテーブルＲＴＮＡ();

    public class Cバッチテーブル依頼Ａ extends CGrp {
        public Cバッチテーブル依頼Ａ() {
            initBuffer();
        }

        public Cバッチテーブル依頼Ａ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYL101B
        public Cバッチテーブル依頼 バッチテーブル依頼 = new Cバッチテーブル依頼();
    }

    public Cバッチテーブル依頼Ａ バッチテーブル依頼Ａ = new Cバッチテーブル依頼Ａ();

    public class CバッチテーブルＲＴＮ詳細Ａ extends CGrp {
        public CバッチテーブルＲＴＮ詳細Ａ() {
            initBuffer();
        }

        public CバッチテーブルＲＴＮ詳細Ａ(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY APYL101C
        public CバッチテーブルＲＴＮ詳細 バッチテーブルＲＴＮ詳細 = new CバッチテーブルＲＴＮ詳細();
    }

    public CバッチテーブルＲＴＮ詳細Ａ バッチテーブルＲＴＮ詳細Ａ = new CバッチテーブルＲＴＮ詳細Ａ();

    public class C個別オープンエリア extends CGrp {
        public C個別オープンエリア() {
            initBuffer();
        }

        public C個別オープンエリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public class CテーブルＤＤ名 extends CGrp {
            public CInt テーブル名数 = CInt(7, S, COMP3).VALUE(2);
            public CInt エラーＤＤ名位置 = CInt(7, S, COMP3);
            public CXStr テーブル名１ = CXStr(8).VALUE("BDRATA03");
            public CXStr テーブル名２ = CXStr(8).VALUE("BDRATA01");
        }

        public CテーブルＤＤ名 テーブルＤＤ名 = new CテーブルＤＤ名();
    }

    public C個別オープンエリア 個別オープンエリア = new C個別オープンエリア();
    // ## WORKING-STORAGE SECTION END ##

    //FILE-CONTROL
    CFile 債権ＭＲＦ = new CFile(System.getenv("DDD107I1"));
    CFile 物件ＴＲ団体Ｆ = new CFile(System.getenv("DDD107I2"));
    CFile 団体融資ＴＲＦ = new CFile(System.getenv("DDD107I3"));
    CFile 団地Ｆ = new CFile(System.getenv("DDD107O1"));

    @Override
    public void execute(CData... args) {
        execute();
    }

    public void execute() {
        債権ＭＲＦ.record = 債権ＭＲレコード;
        債権ＭＲレコード.file = 債権ＭＲＦ;
        物件ＴＲ団体Ｆ.record = 物件ＴＲ団体レコード;
        物件ＴＲ団体レコード.file = 物件ＴＲ団体Ｆ;
        団体融資ＴＲＦ.record = 団体融資ＴＲレコード;
        団体融資ＴＲレコード.file = 団体融資ＴＲＦ;
        団地Ｆ.record = 団地レコード;
        団地レコード.file = 団地Ｆ;
        S00_MAIN();
    }

    private void S00_MAIN() {
        // HAJIME:
        S10_INIT_RTN();
        while (!(ＦＬＧ_エリア.ＦＬＧ_終了.eq(ＦＬＧ_エリア.ＦＬＧ_オン))) {
            S20_HENKAN_RTN();
        }
        S30_END_RTN();
        throw new StopRunException();
    }

    private void S10_INIT_RTN() {
        // HAJIME:
        move(ＣＳＴ_プログラムＩＤ, ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ.プログラムＩＤ);
        move(ＷＫ_ジョブメッセージ.ＷＫ_処理名, ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ.処理名);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Abs5004:ABSMSSX", ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ, 個別オープンエリア);
        initialize(ＣＮＴ_エリア);
        open("INPUT", 債権ＭＲＦ);
        open("INPUT", 団体融資ＴＲＦ);
        open("INPUT", 物件ＴＲ団体Ｆ);
        open("OUTPUT", 団地Ｆ);
        move("OPEN ", ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_処理区分);
        プロジェクトＴＢＬ処理();
        SUB10_READ_RTN();
        SUB20_READ_RTN();
        SUB30_READ_RTN();
        // S10_INIT_RTN_EXIT:
    }

    private void S20_HENKAN_RTN() {
        // HAJIME:
        if ((団体融資ＴＲレコード.eq(HIGH_VALUE)) || (債権ＭＲレコード.eq(HIGH_VALUE)) || (物件ＴＲ団体レコード.eq(HIGH_VALUE))) {
            move(ＦＬＧ_エリア.ＦＬＧ_オン, ＦＬＧ_エリア.ＦＬＧ_終了);
            return;
        }
        if ((債権ＭＲレコード.債権ＭＲ.レコード共通ＳＴＳ再１.論理削除表示.eq(ＷＫ_論理削除表示ーＧ.ＷＫ_論理削除表示))) {
            SUB10_READ_RTN();
        }
        if ((物件ＴＲ団体レコード.物件ＴＲ団体.レコード共通ＳＴＳ再１.論理削除表示.eq(ＷＫ_論理削除表示ーＧ.ＷＫ_論理削除表示))) {
            SUB20_READ_RTN();
        }
        if ((団体融資ＴＲレコード.団体融資ＴＲ.レコード共通ＳＴＳ再１.論理削除表示.eq(ＷＫ_論理削除表示ーＧ.ＷＫ_論理削除表示))) {
            SUB30_READ_RTN();
        }
        initialize(団地レコード);
        initialize(ＷＫ_エリア);
        if (物件ＴＲ団体レコード.バッチ共通制御部.ＭＲキー.lt(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー)) {
            SUB30_READ_RTN();
        } else if (物件ＴＲ団体レコード.バッチ共通制御部.ＭＲキー.gt(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー)) {
            SUB20_READ_RTN();
        } else if (物件ＴＲ団体レコード.バッチ共通制御部.ＭＲキー.eq(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー)) {
            if (債権ＭＲレコード.バッチ共通制御部.ＭＲキー.lt(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー)) {
                SUB10_READ_RTN();
            } else if (債権ＭＲレコード.バッチ共通制御部.ＭＲキー.gt(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー)) {
                SUB20_READ_RTN();
            } else if (債権ＭＲレコード.バッチ共通制御部.ＭＲキー.eq(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー)) {
                SUB40_MOVE_RTN();
                SUB50_WRITE_RTN();
                SUB10_READ_RTN();
                SUB20_READ_RTN();
                SUB30_READ_RTN();
            }
        }
        // S20_HENKAN_RTN_EXIT:
    }

    private void S30_END_RTN() {
        // HAJIME:
        initialize(基本メッセージ領域);
        move(ＣＳＴ_メッセージ.メッセージＮＯ.件数表示ＮＯ, 基本メッセージ領域.共通基本パラメータ域.詳細情報２);
        moveZero(基本メッセージ領域.共通基本パラメータ域.詳細情報３);
        move(ＣＳＴ_メッセージ.準定型メッセージ, 基本メッセージ領域.共通基本パラメータ域.詳細情報４);
        move(ＣＳＴ_メッセージ.件数_データ長, 基本メッセージ領域.共通基本パラメータ域.詳細情報５);
        move(ＣＳＴ_プログラムＩＤ, メッセージ作成領域.メッセージエリア.プログラムＩＤ);
        move(ＣＳＴ_メッセージ.情報メッセージ, メッセージ作成領域.メッセージエリア.メッセージ種別);
        move(ＣＳＴ_入力, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.入出力表示_１３０４);
        move(ＣＳＴ_ＤＤ名１, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.ＤＤ名_１３０４);
        move(ＣＮＴ_エリア.ＣＮＴ_債権ＭＲ, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.件数_１３０４);
        move(ＷＫ_メッセージ領域.メッセージエリア.付加メッセージ領域, メッセージ作成領域.メッセージエリア.付加メッセージ領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Syjs4400", 基本メッセージ領域, メッセージ作成領域);
        move(ＣＳＴ_入力, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.入出力表示_１３０４);
        move(ＣＳＴ_ＤＤ名２, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.ＤＤ名_１３０４);
        move(ＣＮＴ_エリア.ＣＮＴ_物件ＴＲ団体, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.件数_１３０４);
        move(ＷＫ_メッセージ領域.メッセージエリア.付加メッセージ領域, メッセージ作成領域.メッセージエリア.付加メッセージ領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Syjs4400", 基本メッセージ領域, メッセージ作成領域);
        move(ＣＳＴ_入力, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.入出力表示_１３０４);
        move(ＣＳＴ_ＤＤ名３, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.ＤＤ名_１３０４);
        move(ＣＮＴ_エリア.ＣＮＴ_団体融資ＴＲ, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.件数_１３０４);
        move(ＷＫ_メッセージ領域.メッセージエリア.付加メッセージ領域, メッセージ作成領域.メッセージエリア.付加メッセージ領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Syjs4400", 基本メッセージ領域, メッセージ作成領域);
        move(ＣＳＴ_出力, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.入出力表示_１３０４);
        move(ＣＳＴ_ＤＤ名１０, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.ＤＤ名_１３０４);
        move(ＣＮＴ_エリア.ＣＮＴ_団地, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.件数_１３０４);
        move(ＷＫ_メッセージ領域.メッセージエリア.付加メッセージ領域, メッセージ作成領域.メッセージエリア.付加メッセージ領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Syjs4400", 基本メッセージ領域, メッセージ作成領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Abs5004:ABSMSGE", ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ);
        close(債権ＭＲＦ);
        close(団体融資ＴＲＦ);
        close(物件ＴＲ団体Ｆ);
        close(団地Ｆ);
        move("CLOSE", ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_処理区分);
        プロジェクトＴＢＬ処理();
        // S30_END_RTN_EXIT:
    }

    private void SUB10_READ_RTN() {
        // HAJIME:
        if ((債権ＭＲレコード.eq(HIGH_VALUE)) || (ＦＬＧ_エリア.ＦＬＧ_債権ＭＲ.eq(ＦＬＧ_エリア.ＦＬＧ_オン))) {
            move(ＦＬＧ_エリア.ＦＬＧ_オフ, ＦＬＧ_エリア.ＦＬＧ_債権ＭＲ);
            return;
        }
        read(債権ＭＲＦ);
        if (債権ＭＲＦ.atEnd()) {
            moveHighValue(債権ＭＲレコード);
            return;
        }
        add(1, ＣＮＴ_エリア.ＣＮＴ_債権ＭＲ);
        // SUB10_READ_RTN_EXIT:
    }

    private void SUB20_READ_RTN() {
        // HAJIME:
        if ((団体融資ＴＲレコード.eq(HIGH_VALUE)) || (ＦＬＧ_エリア.ＦＬＧ_団体融資ＴＲ.eq(ＦＬＧ_エリア.ＦＬＧ_オン))) {
            move(ＦＬＧ_エリア.ＦＬＧ_オフ, ＦＬＧ_エリア.ＦＬＧ_団体融資ＴＲ);
            return;
        }
        read(団体融資ＴＲＦ);
        if (団体融資ＴＲＦ.atEnd()) {
            moveHighValue(団体融資ＴＲレコード);
            return;
        }
        add(1, ＣＮＴ_エリア.ＣＮＴ_団体融資ＴＲ);
        // SUB20_READ_RTN_EXIT:
    }

    private void SUB30_READ_RTN() {
        // HAJIME:
        if ((物件ＴＲ団体レコード.eq(HIGH_VALUE)) || (ＦＬＧ_エリア.ＦＬＧ_物件ＴＲ団体.eq(ＦＬＧ_エリア.ＦＬＧ_オン))) {
            move(ＦＬＧ_エリア.ＦＬＧ_オフ, ＦＬＧ_エリア.ＦＬＧ_物件ＴＲ団体);
            return;
        }
        read(物件ＴＲ団体Ｆ);
        if (物件ＴＲ団体Ｆ.atEnd()) {
            moveHighValue(物件ＴＲ団体レコード);
            return;
        }
        add(1, ＣＮＴ_エリア.ＣＮＴ_物件ＴＲ団体);
        // SUB30_READ_RTN_EXIT:
    }

    private void SUB40_MOVE_RTN() {
        move(団体融資ＴＲレコード.バッチ共通制御部.ＭＲキー, ＷＫ_エリア.ＷＫ_顧客番号.ＷＫ_顧客番号９);
        move(ＷＫ_エリア.ＷＫ_顧客番号, 団地レコード.団地キー.団地_顧客番号);
        move(債権ＭＲレコード.債権ＭＲ.現地支店コード, ＷＫ_更新通番１.ＷＫ_支店コード);
        move(ＷＫ_更新通番１.ＷＫ_支店コード, 団地レコード.旧団地キー.旧団地_支店コード);
        move(団体融資ＴＲレコード.団体融資ＴＲ.プロジェクトコード, ＷＫ_エリア.ＷＫ_プロジェクトコード);
        move(ＷＫ_エリア.ＷＫ_プロジェクトコード, 団地レコード.団地_プロジェクトコード);
        if (団体融資ＴＲレコード.団体融資ＴＲ.プロジェクトコード.eq(ZERO)) {
            moveSpace(団地レコード.団地_プロジェクト名);
        } else {
            move("READ ", ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_処理区分);
            moveSpace(ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_検索キー);
            move(ＷＫ_エリア.ＷＫ_プロジェクトコード, ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_検索キー);
            プロジェクトＴＢＬ処理();
            if (ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_業務エリア.プ検_復帰コード.eq(ZERO)) {
                move(プロジェクトＲ.一般ファイル_プロジェクトファイル.プＦ_プロジェクト漢字, 団地レコード.団地_プロジェクト名);
            } else {
                moveSpace(団地レコード.団地_プロジェクト名);
            }
        }
        move(団体融資ＴＲレコード.団体融資ＴＲ.新規継続, ＷＫ_エリア.ＷＫ_新規継続);
        move(ＷＫ_エリア.ＷＫ_新規継続, 団地レコード.団地_新規継続);
        move(団体融資ＴＲレコード.団体融資ＴＲ.委託区分, ＷＫ_エリア.ＷＫ_委託区分);
        move(ＷＫ_エリア.ＷＫ_委託区分, 団地レコード.団地_委託区分);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.建設地コード, ＷＫ_エリア.ＷＫ_建設地コード);
        move(ＷＫ_エリア.ＷＫ_建設地コード, 団地レコード.団地_建設地コード);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.団地再２.団地名漢字, 団地レコード.団地_団地名漢字);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.郵便番号.substr(1, 3), 団地レコード.団地_建設地住所.団地_郵便番号.団地_郵便番号_親番);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.郵便番号.substr(5, 4), 団地レコード.団地_建設地住所.団地_郵便番号.団地_郵便番号_枝番);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.都道府県名, 団地レコード.団地_建設地住所.団地_都道府県名);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.市区郡町村名, 団地レコード.団地_建設地住所.団地_市区群町村);
        move(物件ＴＲ団体レコード.物件ＴＲ団体.地番方書, 団地レコード.団地_建設地住所.団地_町村番地);
        move(団体融資ＴＲレコード.団体融資ＴＲ.算定情報再２.地域区分建設建物, ＷＫ_エリア.ＷＫ_建物);
        move(ＷＫ_エリア.ＷＫ_建物, 団地レコード.団地_算定情報.団地_地域区分建設系.団地_建物);
        move(団体融資ＴＲレコード.団体融資ＴＲ.算定情報再２.地域区分建設土地, ＷＫ_エリア.ＷＫ_土地);
        move(ＷＫ_エリア.ＷＫ_土地, 団地レコード.団地_算定情報.団地_地域区分建設系.団地_土地);
        move(団体融資ＴＲレコード.団体融資ＴＲ.算定情報再２.地域区分建設マンション, ＷＫ_エリア.ＷＫ_マンション);
        move(ＷＫ_エリア.ＷＫ_マンション, 団地レコード.団地_算定情報.団地_地域区分建設系.団地_マンション);
        move(団体融資ＴＲレコード.団体融資ＴＲ.算定情報再２.三大都市圏等区分, ＷＫ_エリア.ＷＫ_三大都市圏等区分);
        move(ＷＫ_エリア.ＷＫ_三大都市圏等区分, 団地レコード.団地_算定情報.団地_三大都市圏等区分);
        move(団体融資ＴＲレコード.団体融資ＴＲ.算定情報再２.距離帯別地域区分, ＷＫ_エリア.ＷＫ_距離帯別地域区分);
        move(ＷＫ_エリア.ＷＫ_距離帯別地域区分, 団地レコード.団地_算定情報.団地_距離帯別地域区分);
        move(団体融資ＴＲレコード.団体融資ＴＲ.地域区分購入系再３.地域区分購入建物, ＷＫ_エリア.ＷＫ_購入_建物);
        move(ＷＫ_エリア.ＷＫ_購入_建物, 団地レコード.団地_区分_購入.団地_購入_建物);
        move(団体融資ＴＲレコード.団体融資ＴＲ.地域区分購入系再３.地域区分購入土地, ＷＫ_エリア.ＷＫ_購入_土地);
        move(ＷＫ_エリア.ＷＫ_購入_土地, 団地レコード.団地_区分_購入.団地_購入_土地);
        move(団体融資ＴＲレコード.団体融資ＴＲ.地域区分購入系再３.地域区分購入マンション, ＷＫ_エリア.ＷＫ_購入_マンション);
        move(ＷＫ_エリア.ＷＫ_購入_マンション, 団地レコード.団地_区分_購入.団地_購入_マンション);
        move(団体融資ＴＲレコード.団体融資ＴＲ.件数再４.申込者人数, 団地レコード.団地_件数.団地_申込者人数);
        move(団体融資ＴＲレコード.団体融資ＴＲ.件数再４.地方公社人数, 団地レコード.団地_件数.団地_地方公社人数);
        move(団体融資ＴＲレコード.団体融資ＴＲ.件数再４.地方公共団体人数, 団地レコード.団地_件数.団地_地方公共団体人数);
        move(団体融資ＴＲレコード.団体融資ＴＲ.件数再４.保証人人数, 団地レコード.団地_件数.団地_保証人人数);
        move(債権ＭＲレコード.債権基本ＭＲ.事業主体コード, ＷＫ_エリア.ＷＫ_事業主体コード);
        move(ＷＫ_エリア.ＷＫ_事業主体コード.substr(4, 4), 団地レコード.団地_事業主体コード);
        move(団体融資ＴＲレコード.団体融資ＴＲ.融資種別名, 団地レコード.団地_融資種別名);
        move(団体融資ＴＲレコード.団体融資ＴＲ.金融機関再５.建設金融機関コード, ＷＫ_エリア.ＷＫ_建設金融機関コード);
        move(ＷＫ_エリア.ＷＫ_建設金融機関コード, 団地レコード.団地_金融機関.団地_金融機関建設.団地_建設金融機関コード);
        move(ＷＫ_エリア.ＷＫ_建設金融機関コード, ＷＫ_金融機関エリア.ＷＫ_金融機関コード);
        金融機関名取得();
        if (団地レコード.団地_金融機関.団地_金融機関建設.団地_建設金融機関コード.eq(ZERO)) {
            moveZero(広域支店修正ワーク.ＷＫテーブル広域支店);
        } else {
            move(金融機関テーブルＡ.金融機関テーブル.管轄支店情報[ＷＫ_更新通番１.ＷＫ_支店コード.get()].管轄支店コード, 広域支店修正ワーク.ＷＫテーブル広域支店);
        }
        move(ＷＫ_金融機関エリア.ＷＫ_金融機関略称名, 団地レコード.団地_金融機関.団地_金融機関建設.団地_建設金融機関名);
        move(団体融資ＴＲレコード.団体融資ＴＲ.金融機関再５.建設金融機関支店名, 団地レコード.団地_金融機関.団地_金融機関建設.団地_建設支店名);
        move(団体融資ＴＲレコード.団体融資ＴＲ.金融機関再５.購入金融情報繰り返し域[1].購入金融機関コード, ＷＫ_エリア.ＷＫ_購入金融機関コード);
        move(ＷＫ_エリア.ＷＫ_購入金融機関コード, 団地レコード.団地_金融機関.団地_金融機関購入.団地_購入金融機関コード);
        move(ＷＫ_エリア.ＷＫ_購入金融機関コード, ＷＫ_金融機関エリア.ＷＫ_金融機関コード);
        金融機関名取得();
        move(ＷＫ_金融機関エリア.ＷＫ_金融機関略称名, 団地レコード.団地_金融機関.団地_金融機関購入.団地_購入金融機関名);
        move(ＦＬＧ_エリア.ＦＬＧ_オフ, ＷＫ_エリア.Ｗ公庫ＦＬＧ);
        moveZero(ＷＫ_エリア.ＷＫ_管轄支店コード);
        for (ＷＫ_エリア.IX1.set(1); !((ＷＫ_エリア.IX1.gt(20)) || (ＷＫ_エリア.Ｗ公庫ＦＬＧ.eq(ＦＬＧ_エリア.ＦＬＧ_オン))); ＷＫ_エリア.IX1.set(ＷＫ_エリア.IX1
                .get() + 1)) {
            if ((ＷＫ_更新通番１.ＷＫ_支店コード.eq(金融機関テーブルＡ.金融機関テーブル.管轄支店情報[ＷＫ_エリア.IX1.get()].現地公庫支店コード))) {
                move(金融機関テーブルＡ.金融機関テーブル.管轄支店情報[ＷＫ_エリア.IX1.get()].管轄支店コード, ＷＫ_エリア.ＷＫ_管轄支店コード);
                move(ＦＬＧ_エリア.ＦＬＧ_オン, ＷＫ_エリア.Ｗ公庫ＦＬＧ);
            }
        }
        move(団体融資ＴＲレコード.団体融資ＴＲ.金融機関再５.購入金融情報繰り返し域[1].購入金融機関支店名, 団地レコード.団地_金融機関.団地_金融機関購入.団地_購入支店名);
        move(ＷＫ_エリア.ＷＫ_顧客番号.substr(1, 2), 団地レコード.団地_顧客番号証貸.substr(1, 2));
        move(ＷＫ_エリア.ＷＫ_顧客番号.substr(5, 13), 団地レコード.団地_顧客番号証貸.substr(3, 13));
        move(団体融資ＴＲレコード.団体融資ＴＲ.機関保証コード, 団地レコード.団地_機関保証コード);
        move(団体融資ＴＲレコード.団体融資ＴＲ.事前協議年月, ＷＫ_エリア.ＷＫ_事前協議);
        move(ＷＫ_エリア.ＷＫ_事前協議, 団地レコード.団地_事前協議);
        move(団体融資ＴＲレコード.団体融資ＴＲ.工事施行予定業者再６.工事施行予定業者カナ名, 団地レコード.団地_工事施行予定業者.団地_カナ名);
        move(団体融資ＴＲレコード.団体融資ＴＲ.工事施行予定業者再６.工事施行予定業者漢字名, 団地レコード.団地_工事施行予定業者.団地_漢字名);
        move(債権ＭＲレコード.債権ＭＲ.手貸情報.償還情報共通.資金交付済額取得, 団地レコード.団地_資金交付済額取得);
        move(債権ＭＲレコード.債権ＭＲ.手貸情報.償還情報共通.償還済貸付金取得, 団地レコード.団地_償還済貸付金取得);
        if (団地レコード.団地_金融機関.団地_金融機関建設.団地_建設金融機関コード.eq(ZERO)) {
            move(ＷＫ_エリア.ＷＫ_管轄支店コード, ＷＫ_エリア.ＷＫ_広域用支店コード);
        } else {
            move(債権ＭＲレコード.債権ＭＲ.公庫本支店コード, ＷＫ_エリア.ＷＫ_広域用支店コード);
            if (ＷＫ_エリア.ＷＫ_広域用支店コード.ne(広域支店修正ワーク.ＷＫテーブル広域支店)) {
                displaySysout("顧客番号＝", 団地レコード.団地キー.団地_顧客番号);
                displaySysout("建設金融機関＝", 団地レコード.団地_金融機関.団地_金融機関建設.団地_建設金融機関コード);
                displaySysout("債権ＭＲ公庫本支店＝", ＷＫ_エリア.ＷＫ_広域用支店コード);
                displaySysout("金融機関ＴＢＬ管轄支店＝", 広域支店修正ワーク.ＷＫテーブル広域支店);
                displaySysout(" ");
                move(広域支店修正ワーク.ＷＫテーブル広域支店, ＷＫ_エリア.ＷＫ_広域用支店コード);
            }
        }
        move(ＷＫ_エリア.ＷＫ_広域用支店コード, 団地レコード.団地_広域用支店コード);
        move(債権ＭＲレコード.債権ＭＲ.債権分類コード, ＷＫ_エリア.ＷＫ_債権分類コード);
        move(ＷＫ_エリア.ＷＫ_債権分類コード, 団地レコード.団地_債権分類コード);
        move(団体融資ＴＲレコード.団体融資ＴＲ.貸付期限年月日, ＷＫ_エリア.ＷＫ_貸付期限年月日);
        move(ＷＫ_エリア.ＷＫ_貸付期限年月日, 団地レコード.団地_貸付期限年月日);
        move(団体融資ＴＲレコード.団体融資ＴＲ.振替償還顧客番号, ＷＫ_エリア.ＷＫ_振替償還顧客番号);
        move(ＷＫ_エリア.ＷＫ_振替償還顧客番号, 団地レコード.団地_振替償還顧客番号);
        move(団体融資ＴＲレコード.団体融資ＴＲ.振替償還区分, ＷＫ_エリア.ＷＫ_振替償還区分);
        move(ＷＫ_エリア.ＷＫ_振替償還区分, 団地レコード.団地_振替償還区分);
        move(債権ＭＲレコード.債権基本ＭＲ.漢字氏名, 団地レコード.団地_申込者名);
        move(債権ＭＲレコード.債権ＭＲ.融資種別コード, ＷＫ_エリア.ＷＫ_融資種別コード);
        move(ＷＫ_エリア.ＷＫ_融資種別コード, 団地レコード.団地_融資種別コード);
        move(団体融資ＴＲレコード.団体融資ＴＲ.平成１２年度上改正.委託区分現場, ＷＫ_エリア.ＷＫ_委託区分現場);
        move(ＷＫ_エリア.ＷＫ_委託区分現場, 団地レコード.団地_委託区分現場);
        if (団体融資ＴＲレコード.団体融資ＴＲ.平成１２年度上改正.設計審査検査機関ＣＤ.eq(ZERO)) {
            moveSpace(団地レコード.団地_民間機関設計);
        } else {
            move(団体融資ＴＲレコード.団体融資ＴＲ.平成１２年度上改正.設計審査検査機関ＣＤ, 団地レコード.団地_民間機関設計);
        }
        if (団体融資ＴＲレコード.団体融資ＴＲ.平成１２年度上改正.現場審査検査機関ＣＤ.eq(ZERO)) {
            moveSpace(団地レコード.団地_民間機関現場);
        } else {
            move(団体融資ＴＲレコード.団体融資ＴＲ.平成１２年度上改正.現場審査検査機関ＣＤ, 団地レコード.団地_民間機関現場);
        }
        if (!団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.差引機関保証料フラグ.isNumeric()) {
            move("1", 団地レコード.団地_差引フラグ);
        } else {
            move(団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.差引機関保証料フラグ, ＷＫ_エリア.ＷＫ_差引フラグ);
            move(ＷＫ_エリア.ＷＫ_差引フラグ, 団地レコード.団地_差引フラグ);
        }
        if (!団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.差引機関保証料.isNumeric()) {
            moveZero(団地レコード.団地_差引機関保証料);
        } else {
            move(団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.差引機関保証料, 団地レコード.団地_差引機関保証料);
        }
        if (!団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.完了年度.isNumeric()) {
            move("9999", 団地レコード.団地_完了年度);
        } else {
            if (団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.完了年度.eq(ZERO)) {
                move("9999", 団地レコード.団地_完了年度);
            } else {
                move(団体融資ＴＲレコード.団体融資ＴＲ.ＥＵＣ項目.完了年度, ＷＫ_エリア.ＷＫ_完了年度);
                move(ＷＫ_エリア.ＷＫ_完了年度, 団地レコード.団地_完了年度);
            }
        }
        move(団体融資ＴＲレコード.団体融資ＴＲ.債権分割情報.分割情報入力年月日, ＷＫ_エリア.ＷＫ_分割情報入力年月日);
        move(ＷＫ_エリア.ＷＫ_分割情報入力年月日, 団地レコード.団地_分割情報入力年月日);
        move(団体融資ＴＲレコード.団体融資ＴＲ.債権分割情報.分割年月日, ＷＫ_エリア.ＷＫ_分割入力年月日);
        move(ＷＫ_エリア.ＷＫ_分割入力年月日, 団地レコード.団地_分割入力年月日);
        move(団体融資ＴＲレコード.団体融資ＴＲ.債権分割情報.債権分割, ＷＫ_エリア.ＷＫ_債権分割);
        move(ＷＫ_エリア.ＷＫ_債権分割, 団地レコード.団地_債権分割);
        move(団体融資ＴＲレコード.団体融資ＴＲ.団体償還方法, ＷＫ_エリア.ＷＫ_償還方法);
        move(ＷＫ_エリア.ＷＫ_償還方法, 団地レコード.団地_償還方法);
        move(団体融資ＴＲレコード.団体融資ＴＲ.平成２６年度制度改正.任意入力保証料率, 団地レコード.団地_任意入力保証料率);
        move(団体融資ＴＲレコード.団体融資ＴＲ.平成２６年度制度改正.保証料返戻の有無, ＷＫ_エリア.ＷＫ_保証料返戻の有無);
        move(ＷＫ_エリア.ＷＫ_保証料返戻の有無, 団地レコード.団地_保証料返戻の有無);
        // SUB40_MOVE_RTN_EXIT:
    }

    private void SUB50_WRITE_RTN() {
        // HAJIME:
        write(団地レコード.file, 団地レコード);
        add(1, ＣＮＴ_エリア.ＣＮＴ_団地);
        // SUB50_WRITE_RTN_EXIT:
    }

    private void 金融機関名取得() {
        // 開始:
        move(ＷＫ_金融機関エリア.ＷＫ_金融機関コード, 金融機関テーブルアクセスキーＲ.金融機関ＣＤ);
        moveZero(金融機関テーブルアクセスキーＲ.金融機関ゼロ);
        move(バッチテーブルＰＫＴＣＡ, バッチテーブルＰＫＴＡ);
        move(金融機関テーブルアクセスキー, バッチテーブルＰＫＴＡ.バッチテーブルＰＫＴ.アクセスキー);
        move(バッチテーブル依頼Ａ.バッチテーブル依頼.Ａキー指定一致, バッチテーブルＰＫＴＡ.バッチテーブルＰＫＴ.アクセスパターン);
        move(個別オープンエリア.テーブルＤＤ名.テーブル名２, バッチテーブルＰＫＴＡ.バッチテーブルＰＫＴ.テーブルＩＤ);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Sylbtbl1", バッチテーブルＰＫＴＡ, 金融機関テーブルＡ);
        if (バッチテーブルＰＫＴＡ.バッチテーブルＰＫＴ.リターンコード.eq(バッチテーブルＲＴＮＡ.バッチテーブルＲＴＮ.正常)) {
            move(金融機関テーブルＡ.金融機関テーブル.金融機関名称, ＷＫ_金融機関エリア.ＷＫ_金融機関名);
            move(金融機関テーブルＡ.金融機関テーブル.金融機関略称名称, ＷＫ_金融機関エリア.ＷＫ_金融機関略称名);
        } else {
            moveSpace(ＷＫ_金融機関エリア.ＷＫ_金融機関名);
            moveSpace(ＷＫ_金融機関エリア.ＷＫ_金融機関略称名);
        }
        // 終了:
    }

    private void プロジェクトＴＢＬ処理() {
        // 開始:
        initialize(プロジェクトＲ);
        call("jp.go.jhf.sols.core.service.system.dtys.Dbs01090", ＰＪ検索, プロジェクトＲ);
        if (ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_業務エリア.プ検_復帰コード.eq(2)) {
            if (ＰＪ検索.プロジェクトファイル検索処理インターフェース.プ検_処理区分.eq("OPEN")) {
                異常終了処理();
            } else {
                ;
            }
        }
        // 終了:
    }

    private void 異常終了処理() {
        // 開始:
        move(コンスタント_エリア.ＣＳＴ_異常１３０１, バッチ異常終了領域.バッチ異常終了ＰＫＴ.異常事象メッセージＮＯ);
        move(コンスタント_エリア.ＣＳＴ_完了０３９１, バッチ異常終了領域.バッチ異常終了ＰＫＴ.ＡＢＥＮＤコード);
        move(コンスタント_エリア.ＣＳＴ_異常１３０２, バッチ異常終了領域.バッチ異常終了ＰＫＴ.異常終了メッセージＮＯ);
        move(ＣＳＴ_メッセージ.エラメッセージ, 異常事象メッセージ領域.メッセージエリア.メッセージ種別);
        move(ＣＳＴ_プログラムＩＤ, 異常事象メッセージ領域.メッセージエリア.プログラムＩＤ);
        move(コンスタント_エリア.ＣＳＴシフトイン, ＷＫ_埋込メッセージ領域.ＷＫ_制御文字１);
        move(コンスタント_エリア.ＣＳＴ_埋込メッセージエリア.ＣＳＴ_埋込メッセージ, ＷＫ_埋込メッセージ領域.ＷＫ_メッセージ);
        move(コンスタント_エリア.ＣＳＴシフトアウト, ＷＫ_埋込メッセージ領域.ＷＫ_制御文字２);
        move(ＷＫ_埋込メッセージ領域, 異常事象メッセージ領域.メッセージエリア.付加メッセージ領域.付加ＭＳＧ);
        move(ＣＳＴ_メッセージ.エラメッセージ, ジョブ異常終了メッセージ領域.メッセージエリア.メッセージ種別);
        move(ＣＳＴ_プログラムＩＤ, ジョブ異常終了メッセージ領域.メッセージエリア.プログラムＩＤ);
        move(コンスタント_エリア.ＣＳＴ_完了０３９１, ジョブ異常終了メッセージ領域.メッセージエリア.メッセージ領域_１３０２.完了コード_１３０２);
        call("jp.go.jhf.sols.core.util.Absabd0", バッチ異常終了領域.バッチ異常終了ＰＫＴ, 異常事象メッセージ領域, ジョブ異常終了メッセージ領域);
        // 終了:
    }

}
