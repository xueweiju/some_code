package jp.go.jhf.sols.core.service.batch.dtys;

import static jp.co.tis.c2j.CONST.HIGH_VALUE;
import static jp.co.tis.c2j.CONST.ZERO;
import static jp.co.tis.c2j.enumeration.PIC_SV.S;
import static jp.co.tis.c2j.enumeration.USAGE.BIT;
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
import jp.go.jhf.sols.core.dto.afdb1050.C保証人_電話番号;
import jp.go.jhf.sols.core.dto.apa5004.Cジョブメッセージ送出ＰＫＴ;

/**
 * Dbd11000<BR>
 * 保証人バッチ処理用ファイル作成<BR>
 * <BR>
 * 保証人ＴＲのオンライン処理後抽出ファイルを入力して、バッチ処理用ファイルを作成する。<BR>
 * <BR>
 * @author TIS C2J_1.0.0
 * @since 1.0.0
 */
public class Dbd11000 extends CblBase implements ParamSetReference {

    /**
     * Dbd11000のmainメソッド
     *
     * @param args 実行時の引数
     */
    public static void main(String[] args) {

        Dbd11000 pgm = new Dbd11000();
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
    public class C保証人ＴＲレコード extends CRecord {
        public C保証人ＴＲレコード() {
            initBuffer();
        }

        public C保証人ＴＲレコード(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY AFAA0000
        public jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部 バッチ共通制御部 = new jp.go.jhf.sols.core.dto.afaa0000.Cバッチ共通制御部();
        // COPY AFC25000
        public jp.go.jhf.sols.core.dto.afc25000.C保証人ＴＲ 保証人ＴＲ = new jp.go.jhf.sols.core.dto.afc25000.C保証人ＴＲ();
    }

    public C保証人ＴＲレコード 保証人ＴＲレコード = new C保証人ＴＲレコード();

    public class C保証人レコード extends CRecord {
        public C保証人レコード() {
            initBuffer();
        }

        public C保証人レコード(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        // COPY AFDB1050
        public jp.go.jhf.sols.core.dto.afdb1050.C保証人キー 保証人キー = new jp.go.jhf.sols.core.dto.afdb1050.C保証人キー();
        public jp.go.jhf.sols.core.dto.afdb1050.C旧保証人キー 旧保証人キー = new jp.go.jhf.sols.core.dto.afdb1050.C旧保証人キー();
        public CXStr 保証人_レコド削除フラ = CXStr(1);
        public jp.go.jhf.sols.core.dto.afdb1050.C保証人_設立年月日 保証人_設立年月日 = new jp.go.jhf.sols.core.dto.afdb1050.C保証人_設立年月日();
        public CXStr 保証人_名称カナ = CXStr(26);
        public CNStr 保証人_名称漢字 = CNStr(13);
        public jp.go.jhf.sols.core.dto.afdb1050.C保証人_郵便番号 保証人_郵便番号 = new jp.go.jhf.sols.core.dto.afdb1050.C保証人_郵便番号();
        public jp.go.jhf.sols.core.dto.afdb1050.C保証人_住所 保証人_住所 = new jp.go.jhf.sols.core.dto.afdb1050.C保証人_住所();
        public CXStr 保証人_事業主体コード = CXStr(4);
        public CXStr 保証人_業種コード = CXStr(2);
        public CXStr 保証人_職種コード = CXStr(1);
        public CXStr 保証人_国籍 = CXStr(1);
        public CInt 保証人_資本金 = CInt(9, S, COMP3);
        public CInt 保証人_年収 = CInt(9, S, COMP3);
        public jp.go.jhf.sols.core.dto.afdb1050.C保証人_資産 保証人_資産 = new jp.go.jhf.sols.core.dto.afdb1050.C保証人_資産();
        public CXStr 保証人_申込者との関係 = CXStr(2);
        public C保証人_電話番号 保証人_電話番号 = new C保証人_電話番号();
        public CXStr 保証人_完了年度 = CXStr(4);
        public CXStr 保証人_予備２ = CXStr(59);
    }

    public C保証人レコード 保証人レコード = new C保証人レコード();

    // ## FILE SECTION END ##
    // ## WORKING-STORAGE SECTION START ##
    public class CＭＳＧ_コンスタント_エリア extends CGrp {
        public CＭＳＧ_コンスタント_エリア() {
            initBuffer();
        }

        public CＭＳＧ_コンスタント_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CXStr ＣＮ_プログラムＩＤ = CXStr(8).VALUE("DBD11000");
        public CNStr ＣＮ_処理名 = CNStr(15).VALUE("保証人バッチ処理用ファイル作成");
    }

    public CＭＳＧ_コンスタント_エリア ＭＳＧ_コンスタント_エリア = new CＭＳＧ_コンスタント_エリア();

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
    public CXStr ＣＳＴ_入力 = new CXStr(3).VALUE("IN ");
    public CXStr ＣＳＴ_出力 = new CXStr(3).VALUE("OUT");
    public CXStr ＣＳＴ_ＤＤ名１ = new CXStr(8).VALUE("DDD110I1");
    public CXStr ＣＳＴ_ＤＤ名２ = new CXStr(8).VALUE("DDD110O1");

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
        public CLong 準定型メッセージ = CLong(15, COMP3).VALUE(2L);
        public CLong 件数_データ長 = CLong(15, COMP3).VALUE(27L);

        public class CメッセージＮＯ extends CGrp {
            public CLong 件数表示ＮＯ = CLong(15, COMP3).VALUE(1304L);
        }

        public CメッセージＮＯ メッセージＮＯ = new CメッセージＮＯ();
    }

    public CＣＳＴ_メッセージ ＣＳＴ_メッセージ = new CＣＳＴ_メッセージ();

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
            public CInt テーブル名数 = CInt(7, S, COMP3).VALUE(1);
            public CInt エラーＤＤ名位置 = CInt(7, S, COMP3);
            public CXStr テーブル名１ = CXStr(8).VALUE("BDRATA03");
        }

        public CテーブルＤＤ名 テーブルＤＤ名 = new CテーブルＤＤ名();
    }

    public C個別オープンエリア 個別オープンエリア = new C個別オープンエリア();

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
        public CXStr ＦＬＧ_保証人ＴＲ = CXStr(1).VALUE("0");
        public CXStr ＦＬＧ_前日 = CXStr(1).VALUE("0");
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

        public CInt ＣＮＴ_保証人ＴＲ = CInt(7).VALUE(ZERO);
        public CInt ＣＮＴ_保証人 = CInt(7).VALUE(ZERO);
    }

    public CＣＮＴ_エリア ＣＮＴ_エリア = new CＣＮＴ_エリア();

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

    public class CＷＫ_エリア extends CGrp {
        public CＷＫ_エリア() {
            initBuffer();
        }

        public CＷＫ_エリア(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CLong ＷＫ_ＭＲキー = CLong(17);
        public CInt ＷＫ_事業主体コード = CInt(4);
        public CInt ＷＫ_設立年月日 = CInt(8);

        public class CＷＫ_住所名漢字 extends CGrp {
            public CNStr[] ＷＫ_住所名漢字１ = new CNStr[81];
            {
                for (int i = 1; i < 81; i++) {
                    ＷＫ_住所名漢字１[i] = CNStr(1);
                }
            }
        }

        public CＷＫ_住所名漢字 ＷＫ_住所名漢字 = new CＷＫ_住所名漢字();

        public class CＷＫ_住所 extends CGrp {
            public CNStr[] ＷＫ_都道府県名 = new CNStr[5];
            {
                for (int i = 1; i < 5; i++) {
                    ＷＫ_都道府県名[i] = CNStr(1);
                }
            }
            public CNStr[] ＷＫ_市区郡町村名 = new CNStr[14];
            {
                for (int i = 1; i < 14; i++) {
                    ＷＫ_市区郡町村名[i] = CNStr(1);
                }
            }
            public CNStr[] ＷＫ_町村番地名 = new CNStr[31];
            {
                for (int i = 1; i < 31; i++) {
                    ＷＫ_町村番地名[i] = CNStr(1);
                }
            }
        }

        public CＷＫ_住所 ＷＫ_住所 = new CＷＫ_住所();
        public CInt IX1 = CInt(2);
        public CInt IX2 = CInt(2);
        public CInt IX3 = CInt(2);
        public CInt IX4 = CInt(2);
        public CLong ＷＫ_更新通番 = CLong(11);

        public class CＷＫ_更新通番１ extends CGrp {
            public CＷＫ_更新通番１(CData ＷＫ_更新通番) {
                setRedefines(ＷＫ_更新通番);
            }

            public CInt ＷＫ_支店コード = CInt(2);
            public CInt ＷＫ_申込年度 = CInt(1);
            public CInt ＷＫ_種別分類コド = CInt(1);
            public CInt ＷＫ_種別分類連番 = CInt(4);
            public CInt ＷＫ_種別分類枝番 = CInt(2);
            public CInt ＷＫ_レコド削除フラ = CInt(1);
        }

        public CＷＫ_更新通番１ ＷＫ_更新通番１ = new CＷＫ_更新通番１(ＷＫ_更新通番);
    }

    public CＷＫ_エリア ＷＫ_エリア = new CＷＫ_エリア();

    public class CＷＫ_電話番号変換用領域 extends CGrp {
        public CＷＫ_電話番号変換用領域() {
            initBuffer();
        }

        public CＷＫ_電話番号変換用領域(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CInt ＷＫ_市外局番桁数 = CInt(1);
        public CInt ＷＫ_市内局番桁数 = CInt(1);
        public CLong ＷＫ_変換前電話番号 = CLong(11);

        public class CＷＫ_電話Ｒ extends CGrp {
            public CＷＫ_電話Ｒ(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備局番 = CXStr(7);
            public CXStr ＷＫ_加入者番号 = CXStr(4);
        }

        public CＷＫ_電話Ｒ ＷＫ_電話Ｒ = new CＷＫ_電話Ｒ(ＷＫ_変換前電話番号);

        public class CＷＫ_番号７０ extends CGrp {
            public CＷＫ_番号７０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_市外７０ = CXStr(5);
            public CXStr ＷＫ_市内７０ = CXStr(2);
            public CXStr ＷＫ_予備７０ = CXStr(4);
        }

        public CＷＫ_番号７０ ＷＫ_番号７０ = new CＷＫ_番号７０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号６１ extends CGrp {
            public CＷＫ_番号６１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_市外６１ = CXStr(5);
            public CXStr ＷＫ_市内６１ = CXStr(2);
            public CXStr ＷＫ_予備６１ = CXStr(4);
        }

        public CＷＫ_番号６１ ＷＫ_番号６１ = new CＷＫ_番号６１(ＷＫ_変換前電話番号);

        public class CＷＫ_番号６０ extends CGrp {
            public CＷＫ_番号６０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備６０Ｓ = CXStr(1);
            public CXStr ＷＫ_市外６０ = CXStr(5);
            public CXStr ＷＫ_市内６０ = CXStr(1);
            public CXStr ＷＫ_予備６０ = CXStr(4);
        }

        public CＷＫ_番号６０ ＷＫ_番号６０ = new CＷＫ_番号６０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号５２ extends CGrp {
            public CＷＫ_番号５２(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_市外５２ = CXStr(5);
            public CXStr ＷＫ_市内５２ = CXStr(2);
            public CXStr ＷＫ_予備５２ = CXStr(4);
        }

        public CＷＫ_番号５２ ＷＫ_番号５２ = new CＷＫ_番号５２(ＷＫ_変換前電話番号);

        public class CＷＫ_番号５１ extends CGrp {
            public CＷＫ_番号５１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備５１Ｓ = CXStr(1);
            public CXStr ＷＫ_市外５１ = CXStr(5);
            public CXStr ＷＫ_市内５１ = CXStr(1);
            public CXStr ＷＫ_予備５１ = CXStr(4);
        }

        public CＷＫ_番号５１ ＷＫ_番号５１ = new CＷＫ_番号５１(ＷＫ_変換前電話番号);

        public class CＷＫ_番号５０ extends CGrp {
            public CＷＫ_番号５０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備５０Ｓ = CXStr(2);
            public CXStr ＷＫ_市外５０ = CXStr(5);
            public CXStr ＷＫ_予備５０ = CXStr(4);
        }

        public CＷＫ_番号５０ ＷＫ_番号５０ = new CＷＫ_番号５０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号４３ extends CGrp {
            public CＷＫ_番号４３(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_市外４３ = CXStr(4);
            public CXStr ＷＫ_市内４３ = CXStr(3);
            public CXStr ＷＫ_予備４３ = CXStr(4);
        }

        public CＷＫ_番号４３ ＷＫ_番号４３ = new CＷＫ_番号４３(ＷＫ_変換前電話番号);

        public class CＷＫ_番号４２ extends CGrp {
            public CＷＫ_番号４２(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備４２Ｓ = CXStr(1);
            public CXStr ＷＫ_市外４２ = CXStr(4);
            public CXStr ＷＫ_市内４２ = CXStr(2);
            public CXStr ＷＫ_予備４２ = CXStr(4);
        }

        public CＷＫ_番号４２ ＷＫ_番号４２ = new CＷＫ_番号４２(ＷＫ_変換前電話番号);

        public class CＷＫ_番号４１ extends CGrp {
            public CＷＫ_番号４１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備４１Ｓ = CXStr(2);
            public CXStr ＷＫ_市外４１ = CXStr(4);
            public CXStr ＷＫ_市内４１ = CXStr(1);
            public CXStr ＷＫ_予備４１ = CXStr(4);
        }

        public CＷＫ_番号４１ ＷＫ_番号４１ = new CＷＫ_番号４１(ＷＫ_変換前電話番号);

        public class CＷＫ_番号４０ extends CGrp {
            public CＷＫ_番号４０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備４０Ｓ = CXStr(3);
            public CXStr ＷＫ_市外４０ = CXStr(4);
            public CXStr ＷＫ_予備４０ = CXStr(4);
        }

        public CＷＫ_番号４０ ＷＫ_番号４０ = new CＷＫ_番号４０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号３４ extends CGrp {
            public CＷＫ_番号３４(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_市外３４ = CXStr(3);
            public CXStr ＷＫ_市内３４ = CXStr(4);
            public CXStr ＷＫ_予備３４ = CXStr(4);
        }

        public CＷＫ_番号３４ ＷＫ_番号３４ = new CＷＫ_番号３４(ＷＫ_変換前電話番号);

        public class CＷＫ_番号３３ extends CGrp {
            public CＷＫ_番号３３(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備３３Ｓ = CXStr(1);
            public CXStr ＷＫ_市外３３ = CXStr(3);
            public CXStr ＷＫ_市内３３ = CXStr(3);
            public CXStr ＷＫ_予備３３ = CXStr(4);
        }

        public CＷＫ_番号３３ ＷＫ_番号３３ = new CＷＫ_番号３３(ＷＫ_変換前電話番号);

        public class CＷＫ_番号３２ extends CGrp {
            public CＷＫ_番号３２(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備３２Ｓ = CXStr(2);
            public CXStr ＷＫ_市外３２ = CXStr(3);
            public CXStr ＷＫ_市内３２ = CXStr(2);
            public CXStr ＷＫ_予備３２ = CXStr(4);
        }

        public CＷＫ_番号３２ ＷＫ_番号３２ = new CＷＫ_番号３２(ＷＫ_変換前電話番号);

        public class CＷＫ_番号３１ extends CGrp {
            public CＷＫ_番号３１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備３１Ｓ = CXStr(3);
            public CXStr ＷＫ_市外３１ = CXStr(3);
            public CXStr ＷＫ_市内３１ = CXStr(1);
            public CXStr ＷＫ_予備３１ = CXStr(4);
        }

        public CＷＫ_番号３１ ＷＫ_番号３１ = new CＷＫ_番号３１(ＷＫ_変換前電話番号);

        public class CＷＫ_番号３０ extends CGrp {
            public CＷＫ_番号３０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備３０Ｓ = CXStr(4);
            public CXStr ＷＫ_市外３０ = CXStr(3);
            public CXStr ＷＫ_予備３０ = CXStr(4);
        }

        public CＷＫ_番号３０ ＷＫ_番号３０ = new CＷＫ_番号３０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号２４ extends CGrp {
            public CＷＫ_番号２４(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備２４Ｓ = CXStr(1);
            public CXStr ＷＫ_市外２４ = CXStr(2);
            public CXStr ＷＫ_市内２４ = CXStr(4);
            public CXStr ＷＫ_予備２４ = CXStr(4);
        }

        public CＷＫ_番号２４ ＷＫ_番号２４ = new CＷＫ_番号２４(ＷＫ_変換前電話番号);

        public class CＷＫ_番号２３ extends CGrp {
            public CＷＫ_番号２３(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備２３Ｓ = CXStr(2);
            public CXStr ＷＫ_市外２３ = CXStr(2);
            public CXStr ＷＫ_市内２３ = CXStr(3);
            public CXStr ＷＫ_予備２３ = CXStr(4);
        }

        public CＷＫ_番号２３ ＷＫ_番号２３ = new CＷＫ_番号２３(ＷＫ_変換前電話番号);

        public class CＷＫ_番号２２ extends CGrp {
            public CＷＫ_番号２２(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備２２Ｓ = CXStr(3);
            public CXStr ＷＫ_市外２２ = CXStr(2);
            public CXStr ＷＫ_市内２２ = CXStr(2);
            public CXStr ＷＫ_予備２２ = CXStr(4);
        }

        public CＷＫ_番号２２ ＷＫ_番号２２ = new CＷＫ_番号２２(ＷＫ_変換前電話番号);

        public class CＷＫ_番号２１ extends CGrp {
            public CＷＫ_番号２１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備２１Ｓ = CXStr(4);
            public CXStr ＷＫ_市外２１ = CXStr(2);
            public CXStr ＷＫ_市内２１ = CXStr(1);
            public CXStr ＷＫ_予備２１ = CXStr(4);
        }

        public CＷＫ_番号２１ ＷＫ_番号２１ = new CＷＫ_番号２１(ＷＫ_変換前電話番号);

        public class CＷＫ_番号２０ extends CGrp {
            public CＷＫ_番号２０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備２０Ｓ = CXStr(5);
            public CXStr ＷＫ_市外２０ = CXStr(2);
            public CXStr ＷＫ_予備２０ = CXStr(4);
        }

        public CＷＫ_番号２０ ＷＫ_番号２０ = new CＷＫ_番号２０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号１４ extends CGrp {
            public CＷＫ_番号１４(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備１４Ｓ = CXStr(2);
            public CXStr ＷＫ_市外１４ = CXStr(1);
            public CXStr ＷＫ_市内１４ = CXStr(4);
            public CXStr ＷＫ_予備１４ = CXStr(4);
        }

        public CＷＫ_番号１４ ＷＫ_番号１４ = new CＷＫ_番号１４(ＷＫ_変換前電話番号);

        public class CＷＫ_番号１３ extends CGrp {
            public CＷＫ_番号１３(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備１３Ｓ = CXStr(3);
            public CXStr ＷＫ_市外１３ = CXStr(1);
            public CXStr ＷＫ_市内１３ = CXStr(3);
            public CXStr ＷＫ_予備１３ = CXStr(4);
        }

        public CＷＫ_番号１３ ＷＫ_番号１３ = new CＷＫ_番号１３(ＷＫ_変換前電話番号);

        public class CＷＫ_番号１２ extends CGrp {
            public CＷＫ_番号１２(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備１２Ｓ = CXStr(4);
            public CXStr ＷＫ_市外１２ = CXStr(1);
            public CXStr ＷＫ_市内１２ = CXStr(2);
            public CXStr ＷＫ_予備１２ = CXStr(4);
        }

        public CＷＫ_番号１２ ＷＫ_番号１２ = new CＷＫ_番号１２(ＷＫ_変換前電話番号);

        public class CＷＫ_番号１１ extends CGrp {
            public CＷＫ_番号１１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備１１Ｓ = CXStr(5);
            public CXStr ＷＫ_市外１１ = CXStr(1);
            public CXStr ＷＫ_市内１１ = CXStr(1);
            public CXStr ＷＫ_予備１１ = CXStr(4);
        }

        public CＷＫ_番号１１ ＷＫ_番号１１ = new CＷＫ_番号１１(ＷＫ_変換前電話番号);

        public class CＷＫ_番号１０ extends CGrp {
            public CＷＫ_番号１０(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備１０Ｓ = CXStr(6);
            public CXStr ＷＫ_市外１０ = CXStr(1);
            public CXStr ＷＫ_予備１０ = CXStr(4);
        }

        public CＷＫ_番号１０ ＷＫ_番号１０ = new CＷＫ_番号１０(ＷＫ_変換前電話番号);

        public class CＷＫ_番号０４ extends CGrp {
            public CＷＫ_番号０４(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備０４Ｓ = CXStr(3);
            public CXStr ＷＫ_市内０４ = CXStr(4);
            public CXStr ＷＫ_予備０４ = CXStr(4);
        }

        public CＷＫ_番号０４ ＷＫ_番号０４ = new CＷＫ_番号０４(ＷＫ_変換前電話番号);

        public class CＷＫ_番号０３ extends CGrp {
            public CＷＫ_番号０３(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備０３Ｓ = CXStr(4);
            public CXStr ＷＫ_市内０３ = CXStr(3);
            public CXStr ＷＫ_予備０３ = CXStr(4);
        }

        public CＷＫ_番号０３ ＷＫ_番号０３ = new CＷＫ_番号０３(ＷＫ_変換前電話番号);

        public class CＷＫ_番号０２ extends CGrp {
            public CＷＫ_番号０２(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備０２Ｓ = CXStr(5);
            public CXStr ＷＫ_市内０２ = CXStr(2);
            public CXStr ＷＫ_予備０２ = CXStr(4);
        }

        public CＷＫ_番号０２ ＷＫ_番号０２ = new CＷＫ_番号０２(ＷＫ_変換前電話番号);

        public class CＷＫ_番号０１ extends CGrp {
            public CＷＫ_番号０１(CData ＷＫ_変換前電話番号) {
                setRedefines(ＷＫ_変換前電話番号);
            }

            public CXStr ＷＫ_予備０１Ｓ = CXStr(6);
            public CXStr ＷＫ_市内０１ = CXStr(1);
            public CXStr ＷＫ_予備０１ = CXStr(4);
        }

        public CＷＫ_番号０１ ＷＫ_番号０１ = new CＷＫ_番号０１(ＷＫ_変換前電話番号);
    }

    public CＷＫ_電話番号変換用領域 ＷＫ_電話番号変換用領域 = new CＷＫ_電話番号変換用領域();

    public class CＷＫ_変換後電話番号 extends CGrp {
        public CＷＫ_変換後電話番号() {
            initBuffer();
        }

        public CＷＫ_変換後電話番号(boolean initBuffer) {
            if (initBuffer) {
                initBuffer();
            }
        }

        public CXStr ＷＫ_変換後市外局番 = CXStr(5);
        public CXStr ＷＫ_変換後市内局番 = CXStr(4);
        public CXStr ＷＫ_変換後加入者番号 = CXStr(4);
    }

    public CＷＫ_変換後電話番号 ＷＫ_変換後電話番号 = new CＷＫ_変換後電話番号();
    // ## WORKING-STORAGE SECTION END ##

    //FILE-CONTROL
    CFile 保証人ＴＲファイル = new CFile(System.getenv("DDD110I1"));
    CFile 保証人ファイル = new CFile(System.getenv("DDD110O1"));

    @Override
    public void execute(CData... args) {
        execute();
    }

    public void execute() {
        保証人ＴＲファイル.record = 保証人ＴＲレコード;
        保証人ＴＲレコード.file = 保証人ＴＲファイル;
        保証人ファイル.record = 保証人レコード;
        保証人レコード.file = 保証人ファイル;
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
        move(ＭＳＧ_コンスタント_エリア.ＣＮ_プログラムＩＤ, ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ.プログラムＩＤ);
        move(ＭＳＧ_コンスタント_エリア.ＣＮ_処理名, ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ.処理名);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Abs5004:ABSMSSX", ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ, 個別オープンエリア);
        initialize(ＣＮＴ_エリア);
        open("INPUT", 保証人ＴＲファイル);
        open("OUTPUT", 保証人ファイル);
        SUB10_READ_RTN();
        // S10_INIT_RTN_EXIT:
    }

    private void S20_HENKAN_RTN() {
        // HAJIME:
        if ((保証人ＴＲレコード.eq(HIGH_VALUE))) {
            move(ＦＬＧ_エリア.ＦＬＧ_オン, ＦＬＧ_エリア.ＦＬＧ_終了);
            return;
        }
        PRE_S20_READ: {
            if ((保証人ＴＲレコード.保証人ＴＲ.レコード共通ＳＴＳ再１.論理削除表示.eq(ＷＫ_論理削除表示ーＧ.ＷＫ_論理削除表示))) {
                break PRE_S20_READ; // GOTO S20_READ
            }
            initialize(保証人レコード);
            initialize(ＷＫ_エリア);
            initialize(ＷＫ_電話番号変換用領域);
            move(保証人ＴＲレコード.バッチ共通制御部.ＭＲキー, ＷＫ_エリア.ＷＫ_ＭＲキー);
            move(ＷＫ_エリア.ＷＫ_ＭＲキー, 保証人レコード.保証人キー.保証人_顧客番号);
            move(ＷＫ_エリア.ＷＫ_ＭＲキー.substr(1, 2), 保証人レコード.旧保証人キー.旧保証人_支店コード);
            move(保証人ＴＲレコード.バッチ共通制御部.ＴＲキー１, 保証人レコード.保証人キー.保証人_連番保証人番);
            move(保証人ＴＲレコード.バッチ共通制御部.ＴＲキー１, 保証人レコード.旧保証人キー.旧保証人_連番保証人番);
            move(保証人ＴＲレコード.保証人ＴＲ.氏名カナ, 保証人レコード.保証人_名称カナ);
            move(保証人ＴＲレコード.保証人ＴＲ.氏名漢字, 保証人レコード.保証人_名称漢字);
            move(保証人ＴＲレコード.保証人ＴＲ.国籍, 保証人レコード.保証人_国籍);
            move(保証人ＴＲレコード.保証人ＴＲ.年収, 保証人レコード.保証人_年収);
            move(保証人ＴＲレコード.保証人ＴＲ.現郵便番号.substr(1, 3), 保証人レコード.保証人_郵便番号.保証人_郵便番号_親番);
            move(保証人ＴＲレコード.保証人ＴＲ.現郵便番号.substr(5, 4), 保証人レコード.保証人_郵便番号.保証人_郵便番号_枝番);
            move(保証人ＴＲレコード.保証人ＴＲ.住所名漢字, ＷＫ_エリア.ＷＫ_住所名漢字);
            for (ＷＫ_エリア.IX1.set(1); !(ＷＫ_エリア.IX1.gt(保証人ＴＲレコード.保証人ＴＲ.漢字町域桁１)); ＷＫ_エリア.IX1.set(ＷＫ_エリア.IX1.get() + 1)) {
                move(ＷＫ_エリア.ＷＫ_住所名漢字.ＷＫ_住所名漢字１[ＷＫ_エリア.IX1.get()], ＷＫ_エリア.ＷＫ_住所.ＷＫ_都道府県名[ＷＫ_エリア.IX1.get()]);
            }
            move(ＷＫ_エリア.IX1, ＷＫ_エリア.IX2);
            for (ＷＫ_エリア.IX1.set(1); !(ＷＫ_エリア.IX1.gt(保証人ＴＲレコード.保証人ＴＲ.漢字町域桁２)); ＷＫ_エリア.IX1.set(ＷＫ_エリア.IX1.get() + 1)) {
                move(ＷＫ_エリア.ＷＫ_住所名漢字.ＷＫ_住所名漢字１[ＷＫ_エリア.IX2.get()], ＷＫ_エリア.ＷＫ_住所.ＷＫ_市区郡町村名[ＷＫ_エリア.IX1.get()]);
                add(1, ＷＫ_エリア.IX2);
            }
            for (ＷＫ_エリア.IX1.set(1); !(ＷＫ_エリア.IX1.gt(30)); ＷＫ_エリア.IX1.set(ＷＫ_エリア.IX1.get() + 1)) {
                move(ＷＫ_エリア.ＷＫ_住所名漢字.ＷＫ_住所名漢字１[ＷＫ_エリア.IX2.get()], ＷＫ_エリア.ＷＫ_住所.ＷＫ_町村番地名[ＷＫ_エリア.IX1.get()]);
                add(1, ＷＫ_エリア.IX2);
            }
            move(ＷＫ_エリア.ＷＫ_住所, 保証人レコード.保証人_住所);
            move(保証人ＴＲレコード.保証人ＴＲ.事業主体ＣＤ, ＷＫ_エリア.ＷＫ_事業主体コード);
            move(ＷＫ_エリア.ＷＫ_事業主体コード, 保証人レコード.保証人_事業主体コード);
            move(保証人ＴＲレコード.保証人ＴＲ.業種ＣＤ, 保証人レコード.保証人_業種コード);
            move(保証人ＴＲレコード.保証人ＴＲ.職種ＣＤ, 保証人レコード.保証人_職種コード);
            move(保証人ＴＲレコード.保証人ＴＲ.動産, 保証人レコード.保証人_資産.保証人_動産);
            move(保証人ＴＲレコード.保証人ＴＲ.不動産, 保証人レコード.保証人_資産.保証人_不動産);
            move(保証人ＴＲレコード.保証人ＴＲ.申込者との関係, 保証人レコード.保証人_申込者との関係);
            move(保証人ＴＲレコード.保証人ＴＲ.資本金, 保証人レコード.保証人_資本金);
            move(保証人ＴＲレコード.保証人ＴＲ.生年月日, ＷＫ_エリア.ＷＫ_設立年月日);
            move(ＷＫ_エリア.ＷＫ_設立年月日, 保証人レコード.保証人_設立年月日);
            move(保証人ＴＲレコード.保証人ＴＲ.自宅市外局番桁数, ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数);
            move(保証人ＴＲレコード.保証人ＴＲ.自宅市内局番桁数, ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数);
            move(保証人ＴＲレコード.保証人ＴＲ.自宅電話番号, ＷＫ_電話番号変換用領域.ＷＫ_変換前電話番号);
            電話番号変換処理();
            move(ＷＫ_変換後電話番号, 保証人レコード.保証人_電話番号);
            SUB20_WRITE_RTN();
        }
        // S20_READ
        SUB10_READ_RTN();
        // S20_HENKAN_RTN_EXIT:
    }

    private void S30_END_RTN() {
        // HAJIME:
        close(保証人ＴＲファイル);
        close(保証人ファイル);
        move(ＣＳＴ_メッセージ.メッセージＮＯ.件数表示ＮＯ, 基本メッセージ領域.共通基本パラメータ域.詳細情報２);
        moveZero(基本メッセージ領域.共通基本パラメータ域.詳細情報３);
        move(ＣＳＴ_メッセージ.準定型メッセージ, 基本メッセージ領域.共通基本パラメータ域.詳細情報４);
        move(ＣＳＴ_メッセージ.件数_データ長, 基本メッセージ領域.共通基本パラメータ域.詳細情報５);
        move(ＭＳＧ_コンスタント_エリア.ＣＮ_プログラムＩＤ, メッセージ作成領域.メッセージエリア.プログラムＩＤ);
        move(ＣＳＴ_メッセージ.情報メッセージ, メッセージ作成領域.メッセージエリア.メッセージ種別);
        move(ＣＳＴ_入力, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.入出力表示_１３０４);
        move(ＣＳＴ_ＤＤ名１, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.ＤＤ名_１３０４);
        move(ＣＮＴ_エリア.ＣＮＴ_保証人ＴＲ, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.件数_１３０４);
        move(ＷＫ_メッセージ領域.メッセージエリア.付加メッセージ領域, メッセージ作成領域.メッセージエリア.付加メッセージ領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Syjs4400", 基本メッセージ領域, メッセージ作成領域);
        move(ＣＳＴ_出力, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.入出力表示_１３０４);
        move(ＣＳＴ_ＤＤ名２, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.ＤＤ名_１３０４);
        move(ＣＮＴ_エリア.ＣＮＴ_保証人, ＷＫ_メッセージ領域.メッセージエリア.メッセージ領域_１３０４.件数_１３０４);
        move(ＷＫ_メッセージ領域.メッセージエリア.付加メッセージ領域, メッセージ作成領域.メッセージエリア.付加メッセージ領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Syjs4400", 基本メッセージ領域, メッセージ作成領域);
        call("jp.go.jhf.sols.core.service.system.gymkyt.Abs5004:ABSMSGE", ＷＫ_ジョブパラ.ジョブメッセージ送出ＰＫＴ);
        // S30_END_RTN_EXIT:
    }

    private void SUB10_READ_RTN() {
        // HAJIME:
        if ((保証人ＴＲレコード.eq(HIGH_VALUE)) || (ＦＬＧ_エリア.ＦＬＧ_保証人ＴＲ.eq(ＦＬＧ_エリア.ＦＬＧ_オン))) {
            move(ＦＬＧ_エリア.ＦＬＧ_オフ, ＦＬＧ_エリア.ＦＬＧ_保証人ＴＲ);
            return;
        }
        read(保証人ＴＲファイル);
        if (保証人ＴＲファイル.atEnd()) {
            moveHighValue(保証人ＴＲレコード);
            return;
        }
        add(1, ＣＮＴ_エリア.ＣＮＴ_保証人ＴＲ);
        // SUB10_READ_RTN_EXIT:
    }

    private void SUB20_WRITE_RTN() {
        // HAJIME:
        write(保証人レコード.file, 保証人レコード);
        add(1, ＣＮＴ_エリア.ＣＮＴ_保証人);
        // SUB20_WRITE_RTN_EXIT:
    }

    private void 電話番号変換処理() {
        // 電話番号変換処理開始:
        initialize(ＷＫ_変換後電話番号);
        if (ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.ne(ZERO) || ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.ne(ZERO)) {
            move(ＷＫ_電話番号変換用領域.ＷＫ_電話Ｒ.ＷＫ_加入者番号, ＷＫ_変換後電話番号.ＷＫ_変換後加入者番号);
            if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(7)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号７０.ＷＫ_市外７０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号７０.ＷＫ_市内７０, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(6)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号６１.ＷＫ_市外６１, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号６１.ＷＫ_市内６１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(6)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号６０.ＷＫ_市外６０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号６０.ＷＫ_市内６０, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(5)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(2))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号５２.ＷＫ_市外５２, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号５２.ＷＫ_市内５２, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(5)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号５１.ＷＫ_市外５１, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号５１.ＷＫ_市内５１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(5)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号５０.ＷＫ_市外５０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(4)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(3))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４３.ＷＫ_市外４３, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４３.ＷＫ_市内４３, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(4)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(2))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４２.ＷＫ_市外４２, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４２.ＷＫ_市内４２, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(4)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４１.ＷＫ_市外４１, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４１.ＷＫ_市内４１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(4)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号４０.ＷＫ_市外４０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(3)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(4))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３４.ＷＫ_市外３４, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３４.ＷＫ_市内３４, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(3)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(3))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３３.ＷＫ_市外３３, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３３.ＷＫ_市内３３, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(3)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(2))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３２.ＷＫ_市外３２, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３２.ＷＫ_市内３２, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(3)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３１.ＷＫ_市外３１, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３１.ＷＫ_市内３１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(3)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号３０.ＷＫ_市外３０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(2)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(4))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２４.ＷＫ_市外２４, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２４.ＷＫ_市内２４, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(2)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(3))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２３.ＷＫ_市外２３, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２３.ＷＫ_市内２３, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(2)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(2))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２２.ＷＫ_市外２２, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２２.ＷＫ_市内２２, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(2)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２１.ＷＫ_市外２１, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２１.ＷＫ_市内２１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(2)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号２０.ＷＫ_市外２０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(1)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(4))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１４.ＷＫ_市外１４, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１４.ＷＫ_市内１４, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(1)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(3))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１３.ＷＫ_市外１３, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１３.ＷＫ_市内１３, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(1)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(2))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１２.ＷＫ_市外１２, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１２.ＷＫ_市内１２, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(1)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１１.ＷＫ_市外１１, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１１.ＷＫ_市内１１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(1)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(0))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号１０.ＷＫ_市外１０, ＷＫ_変換後電話番号.ＷＫ_変換後市外局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(0)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(4))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号０４.ＷＫ_市内０４, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(0)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(3))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号０３.ＷＫ_市内０３, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(0)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(2))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号０２.ＷＫ_市内０２, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else if ((ＷＫ_電話番号変換用領域.ＷＫ_市外局番桁数.eq(0)) && (ＷＫ_電話番号変換用領域.ＷＫ_市内局番桁数.eq(1))) {
                move(ＷＫ_電話番号変換用領域.ＷＫ_番号０１.ＷＫ_市内０１, ＷＫ_変換後電話番号.ＷＫ_変換後市内局番);
            } else {
                initialize(ＷＫ_変換後電話番号.ＷＫ_変換後加入者番号);
            }
        }
        // 電話番号変換処理終了:
    }

}
