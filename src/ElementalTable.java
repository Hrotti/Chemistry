/**
 * Created by Alex on 3/16/2019.
 */
public class ElementalTable {

    //region Elements
    private Atom H  = new Atom(1,1,0);
    private Atom He = new Atom(2,2,2);
    private Atom Li = new Atom(3,3,4);
    private Atom Be = new Atom(4,4,5);
    private Atom B  = new Atom(5,5,6);
    private Atom C  = new Atom(6,6,6);
    private Atom N  = new Atom(7,7,7);
    private Atom O  = new Atom(8,8,8);
    private Atom F  = new Atom(9,9,10);
    private Atom Ne = new Atom(10,10,10);
    private Atom Na = new Atom(11,11,12);
    private Atom Mg = new Atom(12,12,12);
    private Atom Al = new Atom(13,13,14);
    private Atom Si = new Atom(14,14,14);
    private Atom P  = new Atom(15,15,16);
    private Atom Cl = new Atom(17,17,18);
    private Atom Ar = new Atom(18,18,22);
    private Atom K  = new Atom(19,19,20);
    private Atom Ca = new Atom(20,20,20);
    private Atom Sc = new Atom(21,21,24);
    private Atom Ti = new Atom(22,22,24);
    private Atom V  = new Atom(23,23,28);
    private Atom Cr = new Atom(24,24,28);
    private Atom Mn = new Atom(25,25,30);
    private Atom Fe = new Atom(26,26,30);
    private Atom Co = new Atom(27,27,32);
    private Atom Ni = new Atom(28,28,31);
    private Atom Cu = new Atom(29,29,35);
    private Atom Zn = new Atom(30,30,35);
    private Atom Ga = new Atom(31,31,39);
    private Atom Ge = new Atom(32,32,41);
    private Atom As = new Atom(33,33,42);
    private Atom Se = new Atom(34,34,45);
    private Atom Br = new Atom(35,35,45);
    private Atom Kr = new Atom(36,36,48);
    private Atom Rb = new Atom(37,37,48);
    private Atom Sr = new Atom(38,38,50);
    private Atom Y  = new Atom(39,39,50);
    private Atom Zr = new Atom(40,40,51);
    private Atom Nb = new Atom(41,41,52);
    private Atom Mo = new Atom(42,42,54);
    private Atom Tc = new Atom(43,43,55);
    private Atom Ru = new Atom(44,44,57);
    private Atom Rh = new Atom(45,45,58);
    private Atom Pd = new Atom(46,46,60);
    private Atom Ag = new Atom(47,47,61);
    private Atom Cd = new Atom(48,48,64);
    private Atom In = new Atom(49,49,66);
    private Atom Sn = new Atom(50,50,69);
    private Atom Sb = new Atom(51,51,71);
    private Atom Te = new Atom(52,52,76);
    private Atom I  = new Atom(53,53,74);
    private Atom Xe = new Atom(54,54,77);
    private Atom Cs = new Atom(55,55,78);
    private Atom Ba = new Atom(56,56,81);
    private Atom La = new Atom(57,57,82);
    private Atom Ce = new Atom(58,58,82);
    private Atom Pr = new Atom(59,59,82);
    private Atom Nd = new Atom(60,60,84);
    private Atom Pm = new Atom(61,61,84);
    private Atom Sm = new Atom(62,62,88);
    private Atom Eu = new Atom(63,63,89);
    private Atom Gd = new Atom(64,64,93);
    private Atom Tb = new Atom(65,65,94);
    private Atom Dy = new Atom(66,66,97);
    private Atom Ho = new Atom(67,67,98);
    private Atom Er = new Atom(68,68,99);
    private Atom Tm = new Atom(69,69,100);
    private Atom Yb = new Atom(70,70,103);
    private Atom Lu = new Atom(71,71,104);
    private Atom Hf = new Atom(72,72,106);
    private Atom Ta = new Atom(73,73,108);
    private Atom W  = new Atom(74,74,110);
    private Atom Re = new Atom(75,75,111);
    private Atom Os = new Atom(76,76,114);
    private Atom Ir = new Atom(77,77,115);
    private Atom Pt = new Atom(78,78,117);
    private Atom Au = new Atom(79,79,118);
    private Atom Hg = new Atom(80,80,121);
    private Atom Tl = new Atom(81,81,123);
    private Atom Pb = new Atom(82,82,125);
    private Atom Bi = new Atom(83,83,126);
    private Atom Po = new Atom(84,84,125);
    private Atom At = new Atom(85,85,125);
    private Atom Rn = new Atom(86,86,136);
    private Atom Fr = new Atom(87,87,136);
    private Atom Ra = new Atom(88,88,138);
    private Atom Ac = new Atom(89,89,138);
    private Atom Th = new Atom(90,90,142);
    private Atom Pa = new Atom(91,91,140);
    private Atom U  = new Atom(92,92,146);
    private Atom Np = new Atom(93,93,144);
    private Atom Pu = new Atom(94,94,150);
    private Atom Am = new Atom(95,95,148);
    private Atom Cm = new Atom(96,96,151);
    private Atom Bk = new Atom(97,97,150);
    private Atom Cf = new Atom(89,89,153);
    private Atom Es = new Atom(99,99,153);
    private Atom Fm = new Atom(100,100,157);
    private Atom Md = new Atom(101,101,157);
    private Atom No = new Atom(102,102,157);
    private Atom Lr = new Atom(103,103,163);
    private Atom Rf = new Atom(104,104,163);
    private Atom Db = new Atom(105,105,163);
    private Atom Sg = new Atom(106,106,163);
    private Atom Bh = new Atom(107,107,163);
    private Atom Hs = new Atom(108,108,162);
    private Atom Mt = new Atom(109,109,169);
    private Atom Ds = new Atom(110,110,171);
    private Atom Rg = new Atom(111,111,171);
    private Atom Cn = new Atom(112,112,173);
    private Atom Nh = new Atom(113,113,173);
    private Atom Fl = new Atom(114,114,175);
    private Atom Mc = new Atom(115,115,175);
    private Atom Lv = new Atom(116,116,177);
    private Atom Ts = new Atom(117,117,177);
    private Atom Og = new Atom(118,118,176);
    //endregion

    //region Getters
    public Atom H() {
        return H.clone();
    }

    public Atom He() {
        return He.clone();
    }

    public Atom Li() {
        return Li.clone();
    }

    public Atom Be() {
        return Be.clone();
    }

    public Atom B() {
        return B.clone();
    }

    public Atom C() {
        return C.clone();
    }

    public Atom N() {
        return N.clone();
    }

    public Atom O() {
        return O.clone();
    }

    public Atom F() {
        return F.clone();
    }

    public Atom Ne() {
        return Ne.clone();
    }

    public Atom Na() {
        return Na.clone();
    }

    public Atom Mg() {
        return Mg.clone();
    }

    public Atom Al() {
        return Al.clone();
    }

    public Atom Si() {
        return Si.clone();
    }

    public Atom P() {
        return P.clone();
    }

    public Atom Cl() {
        return Cl.clone();
    }

    public Atom Ar() {
        return Ar.clone();
    }

    public Atom K() {
        return K.clone();
    }

    public Atom Ca() {
        return Ca.clone();
    }

    public Atom Sc() {
        return Sc.clone();
    }

    public Atom Ti() {
        return Ti.clone();
    }

    public Atom V() {
        return V.clone();
    }

    public Atom Cr() {
        return Cr.clone();
    }

    public Atom Mn() {
        return Mn.clone();
    }

    public Atom Fe() {
        return Fe.clone();
    }

    public Atom Co() {
        return Co.clone();
    }

    public Atom Ni() {
        return Ni.clone();
    }

    public Atom Cu() {
        return Cu.clone();
    }

    public Atom Zn() {
        return Zn.clone();
    }

    public Atom Ga() {
        return Ga.clone();
    }

    public Atom Ge() {
        return Ge.clone();
    }

    public Atom As() {
        return As.clone();
    }

    public Atom Se() {
        return Se.clone();
    }

    public Atom Br() {
        return Br.clone();
    }

    public Atom Kr() {
        return Kr.clone();
    }

    public Atom Rb() {
        return Rb.clone();
    }

    public Atom Sr() {
        return Sr.clone();
    }

    public Atom Y() {
        return Y.clone();
    }

    public Atom Zr() {
        return Zr.clone();
    }

    public Atom Nb() {
        return Nb.clone();
    }

    public Atom Mo() {
        return Mo.clone();
    }

    public Atom Tc() {
        return Tc.clone();
    }

    public Atom Ru() {
        return Ru.clone();
    }

    public Atom Rh() {
        return Rh.clone();
    }

    public Atom Pd() {
        return Pd.clone();
    }

    public Atom Ag() {
        return Ag.clone();
    }

    public Atom Cd() {
        return Cd.clone();
    }

    public Atom In() {
        return In.clone();
    }

    public Atom Sn() {
        return Sn.clone();
    }

    public Atom Sb() {
        return Sb.clone();
    }

    public Atom Te() {
        return Te.clone();
    }

    public Atom I() {
        return I.clone();
    }

    public Atom Xe() {
        return Xe.clone();
    }

    public Atom Cs() {
        return Cs.clone();
    }

    public Atom Ba() {
        return Ba.clone();
    }

    public Atom La() {
        return La.clone();
    }

    public Atom Ce() {
        return Ce.clone();
    }

    public Atom Pr() {
        return Pr.clone();
    }

    public Atom Nd() {
        return Nd.clone();
    }

    public Atom Pm() {
        return Pm.clone();
    }

    public Atom Sm() {
        return Sm.clone();
    }

    public Atom Eu() {
        return Eu.clone();
    }

    public Atom Gd() {
        return Gd.clone();
    }

    public Atom Tb() {
        return Tb.clone();
    }

    public Atom Dy() {
        return Dy.clone();
    }

    public Atom Ho() {
        return Ho.clone();
    }

    public Atom Er() {
        return Er.clone();
    }

    public Atom Tm() {
        return Tm.clone();
    }

    public Atom Yb() {
        return Yb.clone();
    }

    public Atom Lu() {
        return Lu.clone();
    }

    public Atom Hf() {
        return Hf.clone();
    }

    public Atom Ta() {
        return Ta.clone();
    }

    public Atom W() {
        return W.clone();
    }

    public Atom Re() {
        return Re.clone();
    }

    public Atom Os() {
        return Os.clone();
    }

    public Atom Ir() {
        return Ir.clone();
    }

    public Atom Pt() {
        return Pt.clone();
    }

    public Atom Au() {
        return Au.clone();
    }

    public Atom Hg() {
        return Hg.clone();
    }

    public Atom Tl() {
        return Tl.clone();
    }

    public Atom Pb() {
        return Pb.clone();
    }

    public Atom Bi() {
        return Bi.clone();
    }

    public Atom Po() {
        return Po.clone();
    }

    public Atom At() {
        return At.clone();
    }

    public Atom Rn() {
        return Rn.clone();
    }

    public Atom Fr() {
        return Fr.clone();
    }

    public Atom Ra() {
        return Ra.clone();
    }

    public Atom Ac() {
        return Ac.clone();
    }

    public Atom Th() {
        return Th.clone();
    }

    public Atom Pa() {
        return Pa.clone();
    }

    public Atom U() {
        return U.clone();
    }

    public Atom Np() {
        return Np.clone();
    }

    public Atom Pu() {
        return Pu.clone();
    }

    public Atom Am() {
        return Am.clone();
    }

    public Atom Cm() {
        return Cm.clone();
    }

    public Atom Bk() {
        return Bk.clone();
    }

    public Atom Cf() {
        return Cf.clone();
    }

    public Atom Es() {
        return Es.clone();
    }

    public Atom Fm() {
        return Fm.clone();
    }

    public Atom Md() {
        return Md.clone();
    }

    public Atom No() {
        return No.clone();
    }

    public Atom Lr() {
        return Lr.clone();
    }

    public Atom Rf() {
        return Rf.clone();
    }

    public Atom Db() {
        return Db.clone();
    }

    public Atom Sg() {
        return Sg.clone();
    }

    public Atom Bh() {
        return Bh.clone();
    }

    public Atom Hs() {
        return Hs.clone();
    }

    public Atom Mt() {
        return Mt.clone();
    }

    public Atom Ds() {
        return Ds.clone();
    }

    public Atom Rg() {
        return Rg.clone();
    }

    public Atom Cn() {
        return Cn.clone();
    }

    public Atom Nh() {
        return Nh.clone();
    }

    public Atom Fl() {
        return Fl.clone();
    }

    public Atom Mc() {
        return Mc.clone();
    }

    public Atom Lv() {
        return Lv.clone();
    }

    public Atom Ts() {
        return Ts.clone();
    }

    public Atom Og() {
        return Og.clone();
    }
    //endregion

}
