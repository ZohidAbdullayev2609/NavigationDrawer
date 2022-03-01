package com.example.navigationdrawer.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawer.R
import com.example.navigationdrawer.adapter.MyRecycleAdapter
import com.example.navigationdrawer.databinding.FragmentSlideshowBinding
import com.example.navigationdrawer.model.About

class SlideshowFragment : Fragment() {

    private lateinit var binding: FragmentSlideshowBinding
    private lateinit var list: ArrayList<About>
    private val myAdapter:MyRecycleAdapter by lazy {
        MyRecycleAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green)

        binding = FragmentSlideshowBinding.inflate(inflater, container, false)

//        loadData()

        myAdapter.list = list
        binding.rvUnivercity.adapter = myAdapter

        myAdapter.setClickListener {
            findNavController().navigate(
                SlideshowFragmentDirections.actionNavSlideshowToSecondFragment(it)
            )
        }

        return binding.root
    }

//    private fun loadData() {
//        list = ArrayList()
//        for (i in 0..5) {
//
//            list.add(
//                About(
//                    R.drawable.tatu,
//                    "TATU",
//                    "Toshkent axborot texnologiyalari universiteti (qisqartmasi TATU; 2002-yilgacha Toshkent elektrotexnika aloqa instituti) — Toshkentdagi oliy oʻquv yurti boʻlib, informatika va axborot texnologiyasi, pochta xizmati, radioeshittirish va televideniya, telekommunikatsiyalar boʻyicha yuqori malakali mutaxassislar tayyorlaydi. Toshkent elektrotexnika aloqa instituti nomi bilan 1955-yilda tashkil qilingan. 2003-yildan hozirgi nomi bilan ataladi. Universitetda va filiallarida 11,000 dan ortiq talabalar taʼlim oladilar. Universitet tashkil qilingandan beri 30 mingdan ortiq yuqori malakali mutaxassis tayyorlandi. Universitetda 9 yoʻnalish boʻyicha bakalavrlar va 5 mutaxassislik boʻyicha magistrlar tayyorlanadi.\n" +
//                            "TATU 1955-yilda tashkil etilgan. 2002-yilgacha Toshkent Elektrotexnika Aloqa Instituti deb nomlangan. 2002-yili 1-iyunda Oʻzbekiston Respublikasi Prezidenti Islom Karimov qaroriga koʻra u universitetga aylantirildi.\n" +
//                            "\n" +
//                            "1955 yil — Toshkent elektrotexnika aloqa instituti (TEAI)\n" +
//                            "1960 yil — Elektroaloqa muhandislari birinchi avlodi tayyorlandi\n" +
//                            "1978 yil — Bishkek, Dushanbe, Almati va Fargʻona shaharlarida TEAI sirtqi fakultetining tayanch punktlari tashkil etildi\n" +
//                            "1993 yil — TEAI instituti qoshida aloqa zobitlarini tayyorlash uchun maxsus fakultet tashkil etildi\n" +
//                            "1994 yil — Markaziy Osiyo respublikalari hamda Moʻgʻuliston, Pokiston va Hindiston aloqa tarmoqlari injener-texnik xodimlari malakasini oshirish uchun institut qoshida Markaziy Osiyo telekommunikatsiya oʻquv markazi (SAUTST) tashkil etildi\n" +
//                            "1997 yil — institut qoshida litsey-instituternat faoliyat yurita boshladi\n" +
//                            "1999 yil — institut qoshida akademik litsey faoliyat yurita boshladi.\n" +
//                            "2003 yil — Oʻzbekiston Respublikasi Prezidenti Farmoniga asosan TEAI Toshkent axborot texnologiyalari universiteti (TATU) deb atala boshlandi\n" +
//                            "2005 yil — Qarshi, Nukus, Samarqand, Urganch va Fargʻona shaharlarida TATU mintaqaviy filiallari tashkil etildi\n" +
//                            "2017 yil — Universitetga Muhammad Al-Xorazmiy nomi berildi\n" +
//                            "Universitet telekommunikatsiya va axborot tizimlari sohasida Markaziy Osiyoda yetakchi oʻquv muassasasi hisoblanadi. Oʻzbekiston Respublikasi Prezidentining 2005-yil 2-iyunda qabul qilingan „Axborot texnologiyalari sohasida kadrlar tayyorlash tizimini takomillashtirish toʻgʻrisida“gi Qaroriga binoan TATU axborot-kommunikatsiya texnologiyalari sohasida kadrlar tayyorlash boʻyicha tayanch oliy oʻquv muassasasi hisoblanadi. Taʼlim bosqichlari: oʻrta taʼlim (2 ta litsey), bakalavriat (25 ta yoʻnalish), magistratura (24 mutaxassislik), aspirantura va doktoranturadan iborat. Universitet binosi, auditoriyalar va kabinetlar, talabalar uyi binosi kapital taʼmirlandi, yangi zamonaviy oʻquv binosi, 700 oʻrinli oshxona, 400 oʻrinli sport majmuasi qurildi. Shu bilan birga, Oʻzbekiston Aloqa va axborotlashtirish agentligi va axborot-kommunikatsiya texnologiyalari sohasida Oʻzbekiston bozorlarida ishlovchi qator kompaniyalar hamda korxonalar tomonidan katta homiylik yordami koʻrsatildi. Universitetda 28 kafedra va 37 oʻquv laboratoriyalari, 10 tadqiqotchilik laboratoriyalari va shaxsiy tarmogʻi bilan kompyuter markazlari, zamonaviy (1800 dan ortiq) komputerlar hamda multimediali sinflar (20 dan ortiq), 400 mingdan ortiq kitoblar bilan axborot-resurs markazi (kutubxona) mavjud. Universitet qoshida ilmiy tadqiqotlar sektori, litsey-instituternat, akademik litsey va kasb-hunar kolleji mavjud. Universitet Germaniya, Angliya, Belgiya, Xitoy, Hindiston, Koreya, Rossiya, Ukraina kabi davlatlar bilan ilmiy hamkorlik qiladi.\n" +
//                            "Universitet faoliyati J. A. Abdumayev, T. D. Rajabov, M. S. Yunusov, T. S. Yoʻldoshboyev, F. B. Abutaliyev, S. S. Kolesov, M. N. Oripov, V. M. Son, Yu. S. Saʼdullayev, V. V. Yakovlev, X. K. Oripov, S.S. Qosimov va boshqa olimlar nomi bilan bogʻliq.\n"
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.milliy,
//                    "UzMU",
//                    "Mirzo Ulugʻbek nomidagi Oʻzbekiston Milliy universiteti (OʻzMU) — Oʻzbekistondagi eng yirik oliy oʻquv yurti va ilmiy tekshirish markazlaridan biri; Oʻrta Osiyo va Qozogʻistondagi birinchi universitet. 1918-yil Turkiston xalq universiteti sifatida Toshkent shahrida tashkil etilgan. Turkiston xalq universiteti 1920-yildan Turkiston davlat universiteti, 1923-yildan Oʻrta Osiyo davlat universiteti (SAGU), 1960-yildan Toshkent davlat universiteti (Toshkent Davlat Universiteti) deb nomlangan. Oʻzbekiston Respublikasi Prezidentining 2000-yil 28-yanvardagi farmoniga muvofiq, universitetga milliy universitet maqomi berildi va u hozirgi nomi bilan ataldi. 1995-yil Mirzo Ulugʻbek nomi berilgan.\n" +
//                            "XX asrning boshlarida Toshkent va Turkiston oʻlkasining jadal rivojlanishi hamda Toshkent va Samarqanddagi gimnaziyalar, Toshkent Real bilim yurti yoki Toshkent shahridagi oʻqituvchilar seminariyasi va boshqa oʻrta ta\\'lim muassasalarini bitirgan oʻqimishli odamlar sonining koʻpayishi munosabati bilan bu yerda oliy oʻquv yurti — vaqtning eng yuqori talablariga javob beradigan universitetni ochish masalasi keskin koʻtarildi.\n" +
//                            "\n" +
//                            "Tayyorgarlik ishlari ham jamoatchilik, ham viloyat ma'muriyati tomonidan amalga oshirildi. Toshkentdagi universitetni ochish uchun smeta va boshqa zarur hujjatlar 1914-yilga tayyorlangan. Biroq, birinchi jahon urushi bu rejalarga toʻsqinlik qildi.[manba koʻrsatilmagan 86 kun]\n" +
//                            "\n" +
//                            "Shunga qaramay, mintaqada oliy oʻquv yurtini ochish zarurati saqlanib qoldi. Shuning uchun 1917-yil 15-22-noyabr kunlari Toshkentda boʻlib oʻtgan Turkiston Sovetlarining III mintaqaviy qurultoyi bu yerda oliy oʻquv yurtini ochishga qaror qildi. Birozdan keyin-1918-yil 17-fevral kuni Toshkent oliy ta'lim rashkchilari jamiyatining ta'sis yigʻilishi boʻlib oʻtdi. Uning tarkibiga rus geografik va texnik jamiyatlari Turkiston boʻlimlari, Toshkent tabiatshunoslar va shifokorlar jamiyati, Toshkent pedagogika va yuridik jamiyatlari, Turkiston qishloq xoʻjaligi jamiyati, musulmon oʻqituvchilari jamiyati, Politexnika kurslari, oʻlkashunoslik oʻqituvchilari uyushmasi vakillari kiradi.[manba koʻrsatilmagan 86 kun]\n" +
//                            "\n" +
//                            "Oliy ta'lim rashkchilari jamiyatining a'zolari matematik VI Romanovskiy, shifokorlar AP Shilov va Mi Slonim, agronom Rr Shreder, me'mor GM Swarichevskiy va boshqalar kabi taniqli olimlar edi. M. I. Sosnovskiy rais etib saylandi.\n" +
//                            "   "
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.politex,
//                    "TDTU",
//                    "Islom Karimov nomidagi Toshkent davlat texnika universiteti — Oʻzbekistonda elektrotexnika, mexanika, texnologiya, geologiya va energetika sohasida kadrlar tayyorlaydigan Oliy taʼlim muassasasi.1918-yilda tashkil topgan Turkiston xalq universitetining „Texnika“ fakulteti tarkibida „Elektromexanika“ boʻlimi ochilgan boʻlib, unda mexanik muhandislar ixtisosligi boʻyicha kadrlar tayyorlab chiqarish ham moʻljallangan edi. 1920-yilda fakultet davlat universiteti maqomiga ega boʻlgach, unda „Maxsus mexanika“ boʻlimi taʼsis etilib, 69 talaba taxsil ola boshladi.[1] 1952-yilda mazkur fakultetlar negizida Toshkent politexnika instituti tashkil topdi. Oʻzbekiston Prezidentining 1991-yil 30-apreldagi farmoniga asosan Vazirlar Mahkamasi 1991-yil 13-mayda qabul qilgan 130-sonli qarori bilan Toshkent politexnika instituti va Toshkent mashinasozlik instituti birlashtirilishi zaminida vujudga keldi. Ayni vaqtda Vazirlar mahkamasi sanoat-fuqarolik qurilishi, qurilish muhandisligi, meʼmorchilik fakultetlarini birlashtirib — Toshkent arxitektura-qurilish instituti, kimyo-texnologiya, oziq-ovqat texnologiyasi fakultetlarini birlashtirib — Toshkent kimyo-texnologiya instituti tashkil etish haqida ham qaror qabul qilgan boʻlib, amalda ikki institutni birlashtirib, uchta mustaqil oliy texnika oʻquv yurtlari- Toshkent davlat texnika universiteti,Toshkent meʼmorchilik-qurilish instituti, Toshkent kimyo-texnologiya instituti tashkil etilgan edi. Navbatdagi qayta qurishlardan Toshkent politexnika institutining: „geologiya-qidiruv“, „kon-metallurgiya“, „avtomatlashtirilgan boshqaruv tizimlari“, „sanoat energetikasi“, „neft va gaz“, „radioelektronika va avtomatika“, „energetika fakultetlari“. Toshkent mashinosozlik institutining: mexanika; texnologiya; mashinalar va apparatlarni konstruksiyalash; traktor va qishloq xoʻjaligi mashinasozligi fakultetlari bilan qoʻshilib, yangi — Toshkent davlat texnika universiteti tarkibi yaratildi va yangi maqomda amal qila boshladi."
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.iqtisodiyot,
//                    "TIDU",
//                    "Toshkent davlat iqtisodiyot universiteti — yirik oliy oʻquv yurti. Oʻzbekiston Respublikasi Oliy va oʻrta maxsus taʼlim vazirligi tarkibida.\n" +
//                            "\n" +
//                            "Oʻzbekiston oliy taʼlim muassasalarining reytingidagi oʻrni – 7 (Oʻzbekiston Respublikasi Vazirlar Mahkamasi huzuridagi Taʼlim sifatini nazorat qilish davlat inspeksiyasi maʼlumoti)\n" +
//                            "Gumanitar va iqtisodiy sohada – 3-oʻrin\n" +
//                            "Oliy taʼlim muassasalarining dunyo reytingidagi oʻrni www.webometrics.info versiyasiga koʻra – 11 204\n" +
//                            "QS World University Rankings versiyasiga koʻra – top mingtalikda mavjud emas\n" +
//                            "The Times Higher Education World University Rankings 2021 – top mingtalikda mavjud emas.\n" +
//                            "\n" +
//                            "1931-yil 13-avgustda Oʻrta Osiyo moliya-iqtisod instituti sifatida tashkil etilgan, keyinchalik Toshkent moliya-iqtisodiyot institutiga aylantirildi, bu institut 1962—91 yillarda Toshkent xalq xoʻjaligi instituti nomi bilan faoliyat koʻrsatdi. 1991-yil 19-iyundan iqtisodiyot universiteti. Universitetda Iqtisodiyot, Buxgalteriya hisobi va audit, Korporativ boshqaruv, Iqtisodiyotda axborot tizimlari va Xalqaro turizm fakultetlari, Magistratura va Sirtqi boʻlimi, 24 ta kafedra bor. Unt Pedagog kadrlarni qayta tayyorlash va ularning malakasini oshirish tarmoq markazi, Oʻzbekiston iqtisodiyotini rivojlantirishning ilmiy asoslari va muammolari ilmiy tadqiqot markazi, Axborot-resurs markazi, Axborot texnologiyalari markazi, universitet tarixi muzeyi faoliyat olib boradi.\n" +
//                            "   "
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.jahon_tillar,
//                    "UzDJTU",
//                    "Oʻzbekiston davlat jahon tillari universiteti — filologiya sohasi boʻyicha yuqori malakali mutaxassislarni tayyorlaydigan Oliy oʻquv yurtlaridan biri. Oʻzbekiston Respublikasining birinchi prezidenti Islom Karimovning 1992-yil 12-maydagi „Oʻzbekiston davlat jahon tillari universitetini tashkil qilish toʻgʻrisida“gi 401-son Farmoniga asosan „Respublika Rus tili va adabiyoti instituti“ hamda „Toshkent chet tillari pedagogika instituti“ning birlashtirilishi orqali tashkil qilingan. Mazkur universitetda 15dan ortiq tillar oʻrgatiladi: ingliz, nemis, fransuz, ispan, xitoy, rus, arab, italyan, koreys, yapon, fors, malay, polyak, hind, turk, yunon va indoneziya tillari shular jumlasidandir. Bugungi kunda universitetda 10 mingga yaqin talabalar mavjud boʻlib, ular bakalavr darajasini olish uchun taʼlim oladilar. Taʼlim Oʻzbekiston hukumati tomonidan belgilangan ikki turda tashkil etilgan: universitetda oʻqishning birinchi turi kontrakt asosida boʻlishi belgilangan. Barcha oʻquv yigʻimlari Oʻzbekiston hukumati standartlari bilan belgilangan boʻlib, universitetda shartnoma asosida tahsil olayotgan har bir talaba toʻlov-shartnomani oʻz vaqtida toʻlashi lozim. Oʻzbekiston davlat jahon tillari universitetida oʻqishning ikkinchi turi grant asosida boʻlishi belgilangan. Barcha iqtidorli talabalar universitet homiylari tomonidan talabalarga bepul oʻqish imkonini beruvchi grantlar bilan taqdirlanadilar. OʻzDJTUda oʻqish muddati bakalavr darajasini olish uchun 4 yil, magistratura uchun esa 2 yil etib belgilangan. Universitet tarkibida 600 dan ortiq oʻz sohasining professional oʻqituvchilari mavjud boʻlib, ularning aksariyati tegishli fanlar boʻyicha professor hisoblanadi. Oʻquv dasturlari va darsliklar talabalar uchun Oʻzbekiston Respublikasi oliy taʼlim standartlariga asosan ishlab chiqilgan boʻlib, oʻquv jarayoni Oʻzbekiston Respublikasi Oliy va oʻrta maxsus taʼlim vazirligi tomonidan nazorat qilinadi. Universitetning administrativ qismi Oʻzbekistonning boshqa milliy universitet va institutlari bilan bir xil. Universitet rahbari rektor hisoblanib, universitetda 5ta prorektor faoliyat koʻrsatadi. Barcha fakultetlar dekanlar tomonidan, kafedralar esa mos ravishda professor-oʻqituvchilar tomonidan nazorat qilinadi. Oʻzbekiston davlat jahon tillari universiteti qoshida bitta akademik litsey mavjud boʻlib, universitet mazkur litseydagi oʻquv jarayonini toʻliq nazorat qiladi. Oʻzbekiston davlat jahon tillari universiteti bugungi kunda koʻplab milliy va xalqaro oliy taʼlim muassasalari, shuningdek, filologiyaga asoslangan koʻplab muassasa va tashkilotlar bilan hamkorlik qilmoqda."
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.pedagogika,
//                    "TDPU",
//                    "Toshkent pedagogika universiteti, Nizomiy nomidagi Toshkent davlat pedagogika universiteti — malakali pedagog va muhandispedagog kadrlar tayyorlovchi oliy oʻquv yurti. 1935-yil 14 sentabrda Oʻrta Osiyo davlat universitetining ped. fakulteta negizida pedagogika instituti sifatida tashkil etilgan. 1953—98 yillarda Toshkent pedagogika instituti deb nomlangan. 1998-yil 24 fevralda Oʻzbekiston Respublikasi Vazirlar Mahkamasining qarori bilan unga universitet maqomi berilgan. 1947-yildan ozarbayjon shoiri va maʼrifatparvari Nizomiy nomi bilan ataladi. Universitetda 12 ft (mat.fizika, tabiiy fanlar, musiqiy taʼlim, badiiygrafika, ped. va psixologiya, boshlangʻich taʼlim va defektologiya, oʻzbek tili va adabiyoti, tarix, chet tillar, rus va koreys filol. si, chaqiriqqacha harbiy taʼlim, kasb taʼlimi), shuningdek, magistrlar tayyorlash boʻyicha 2 ft (ijtimoiygumanitar fanlar mutaxassisliklari, tabiiy fanlar mutaxassisliklari), malaka oshirish va mutaxassislarni qayta tayyorlash boʻyicha 2 ft (malaka oshirish, amaliy psixologlarni qayta tayyorlash), 55 kafedra, axborot texnologiyalari va masofadan oʻqitish, innovatsion texnologiyalar, akademik litseylar va kasbhunar kollejlari bilan aloka markazlari, taʼlim jarayonini taʼminlash va oliy taʼlim muassasalariga ilmiymetodik yordam koʻrsatish oʻquv boʻlimi, pedagogik amaliyot, oliy oʻquv yurtlararo oʻquvmetodik boʻlim, monitoring va ichki nazorat kabi 18 boʻlim bor. Kutubxonasida 900 mingga yaqin asar saqlanadi. Unt mat. va informatika, fizika va astronomiya, kimyo va ekologiya, biol. va inson hayot faoliyati muhofazasi, geogr. va iqtisodiy bilim asoslari, tasviriy sanʼat va muxandislik grafikasi, ped. va psixologiya, kasb taʼlimi, musiqiy taʼlim, oʻzbek tili va adabiyoti, ona tili va adabiyoti (rus, qozoq, koreys), chaqiriqqacha harbiy taʼlim, xorijiy tillar va adabiyot, milliy istiqlol gʻoyasi, huquq va maʼnaviyat asoslari, boshlangʻich taʼlim va sporttarbiyaviy ish, maktabgacha taʼlim va bolalar sporti, defektologiya, jismoniy tarbiya va jismoniy madaniyat, mehnat taʼlimi yoʻnalishi boʻyicha bakalavrlar hamda shu yoʻnalishlarga kirgan 37 mutaxassislik boʻyicha magistrlar tayyorlaydi. Universitetda aspirantura va doktorantura hamda nomzodlik va doktorlik dissertatsiyasi himoyasi boʻyicha ixtisoslashtirilgan ilmiy kengash faoliyat koʻrsatadi. 2003/04 oʻquv yili untda 13269 talaba taʼlim oldi, 779 oʻqituvchi, jumladan, Oʻzbekiston Respublikasi Fanlar akademiyasining 3 haqiqiy aʼzosi, 40 fan doktori va professor, 450 fan nomzodi va dotsent ishladi. Unt respublikada pedagog kadrlar tayyorlovchi barcha oliy taʼlim muassasalari uchun tayanch oliy maktab hisoblanadi. Unt faoliyati III TUT. Abdullayev, M. Asqarova, M. G. Davletshin, N.M. Mallayev, R. X. Mallin, 3. R. Nuriddinov, S. Rajabov, H. Sulaymonov, H.T. Tursunov, M. Shayxzoda, E. Yu. Yusupov, Ya. Gʻulomov, H. Homidiy va boshqa professoroʻqituvchilar nomi bilan bogʻliq. Universitetda \"Pedagogik taʼlim\" (1999-yildan), \"Axborot texnologiyalari\" (2002-yildan) jurnalilari, \"Maʼrifat yoʻlida\", \"Pedagog\" koʻp tirajli gaz. lar nashr etiladi. 2004-yilgacha universitet 74 mingga yaqin mutaxassis tayyorlagan. 2004-yil 23 martda universitet oldidagi maydonda Nizomiy Ganjaviy haykali (meʼmori Valeriy Akopjanyan, haykaltaroshi Ilhom Jabborov) oʻrnatildi. Mazkur haykalning tantanali ochilish marosimida Oʻzbekiston Respublikasi Prezidenti I. Karimov va Ozarbayjon Respublikasi Prezidenti I. Aliyev ishtirok etdi."
//                )
//            )
//        }
//    }



}