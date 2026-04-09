package com.example.pokeraplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pokeraplication.GameOnboardingFragment;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class GameOnboardingFragment extends Fragment {

    private static final String ARG_GAME_NAME = "game_name";

    public static GameOnboardingFragment newInstance(String gameName) {
        GameOnboardingFragment fragment = new GameOnboardingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_GAME_NAME, gameName);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_game_onboarding,
                container,
                false
        );

        ViewPager2 viewPager = view.findViewById(R.id.viewPager);

        // 🔒 Proteção contra NullPointer
        Bundle args = getArguments();
        String gameName = args != null ? args.getString(ARG_GAME_NAME) : null;

        List<Fragment> slides = new ArrayList<>();

        // Exemplo para Truco
        if ("Truco Mineiro".equals(gameName)) {

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.trucomineirocapa,
                    R.drawable.cartasombra,
                    "Truco Mineiro",
                    "Provavelmente originada no século XVII com influência de jesuítas e consolidada pelos bandeirantes durante o Ciclo do Ouro em Minas Gerais."

//mineiro
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodotiracartas,
                    R.drawable.baralhovaziofoto,
                    "Baralho vazio",
                    "Antes de começar o jogo, remova todas as cartas 8, 9, 10 e os coringas — essas cartas não serão usadas. Quando o baralho estiver pronto, a partida pode começar."
//mineiro
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodocartasreiseco,
                    R.drawable.cartasreisecofoto,
                    "Pirâmide de poder das cartas",
                    "No Truco Mineiro, diferente de outras versões, os naipes não fazem diferença na força das cartas. Se dois jogadores jogarem um K, eles empatam"
            ));
//mineiro
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.mostragemcompleta,
                    R.drawable.mostragemcompleta,
                    "",
                    "As cartas da mais forte para a mais fraca. Lembre-se: os naipes não fazem diferença nesta versão do jogo."

//mineiro
            ));


            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.manilhaspagfoto,
                    "Manilhas fixas do truco mineiro",
                    "Manilhas variaveis do Truco mineiro, o numero das cartas manilhas é decidida tirando uma carta no final da distribuição de cartas e virando-lá "
//mineiro
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodacruz,
                    R.drawable.cruzdecartas,
                    "Jeito de jogar",
                    "O jogo tem três rodadas. Em cada uma, cada jogador apresenta uma carta. A carta mais forte vence a rodada. Quem vencer duas rodadas leva um ponto para cada jogador da dupla — ou seja, dois pontos no total. Ganha a dupla que alcançar os 12 pontos."
  //mineiro
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.trucofundo,
                    R.drawable.fotomaope,
                    "Pé, Mão e Contra-pé",
                    "No truco, o 'pé' é o jogador que embaralha e joga por último — uma posição de vantagem. No início, o pé é sorteado e, ao final de cada partida, passa para o jogador à direita. O 'mão' é o primeiro a jogar (desvantagem) e fica à direita do pé. O 'contra-pé' é o penúltimo a jogar fica à esquerda do pé."
                    //mineiro
            ));
//mineiro
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomaope,
                    R.drawable.trucofoto,
                    "Truco !!!",
                    "Truco é o termo usado para aumentar o valor da partida. Gritando 'Truco!', a mão passa a valer 3 pontos. O adversário pode aumentar para 'Seis!' (6 pontos), depois para 'Nove!' (9 pontos) e, por fim, para 'Doze!'."
                    //mineiro
            ));
//mineiro

        }

        if ("Truco Paulista".equals(gameName)) {

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.capadesaopaulo,
                    R.drawable.cartasombra,
                    "Truco Paulista",
                    "Possíveis Origens Europeias: Muitos atribuem a invenção do jogo aos italianos, outros aos ingleses, e há ainda quem aponte para uma origem mais antiga, junto aos etruscos e mouros na Península Ibérica . A versão que deu origem ao nosso truco era muito popular na Inglaterra no século XVII"

//paulista
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.baralhovaziofoto,
                    "Baralho vazio",
                    "Antes de começar o jogo, remova todas as cartas 8, 9, 10 e os coringas — essas cartas não serão usadas. Quando o baralho estiver pronto, a partida pode começar."
//paulista
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodotiracartas,
                    R.drawable.cartasreisecofoto,
                    "Pirâmide de poder das cartas",
                    "No Truco paulista,os naipes fazem total diferença na força das cartas. Se dois jogadores jogarem um K, sendo um de copas outro de paus,paus vence."
            ));
//paulista
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.mostragemtrucopaulista,
                    R.drawable.mostragemtrucopaulista,
                    "",
                    "Listamos as cartas da mais forte para a mais fraca. Lembre-se: os naipes só fazem a difereça quando são jogadas a criterio de desempate."

//paulista
            ));


            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodocartasreiseco,
                    R.drawable.manilhatrucopaulista,
                    "Manilhas variaveis do truco paulista",
                    "Manilhas variaveis do Truco paulista, o numero das cartas manilhas é decidida tirando uma carta no final da distribuição de cartas e virando-lá "
//paulista
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.cruzdecartas,
                    "Jeito de jogar",
                    "O jogo tem três rodadas. Em cada uma, cada jogador apresenta uma carta. A carta mais forte vence a rodada. Quem vencer duas rodadas leva um ponto para cada jogador da dupla — ou seja, dois pontos no total. Ganha a dupla que alcançar os 12 pontos."
            ));
//paulista
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomaope,
                    R.drawable.fotomaope,
                    "Pé, Mão e Contra-pé",
                    "No truco, o 'pé' é o jogador que embaralha e joga por último — uma posição de vantagem. No início, o pé é sorteado e, ao final de cada partida, passa para o jogador à direita. O 'mão' é o primeiro a jogar (desvantagem) e fica à direita do pé. O 'contra-pé' é o penúltimo a jogar fica à esquerda do pé."
            ));
//paulista
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodacruz,
                    R.drawable.trucofoto,
                    "Truco !!!",
                    "Truco é o termo usado para aumentar o valor da partida. Gritando 'Truco!', a mão passa a valer 3 pontos. O adversário pode aumentar para 'Seis!' (6 pontos), depois para 'Nove!' (9 pontos) e, por fim, para 'Doze!'."
            ));
//paulista

        }

        if ("Truco Paranaense".equals(gameName)) {

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.paranaimage,
                    R.drawable.cartasombra,
                    "Truco Paranaense",
                    "O truco paranaense surgiu como uma adaptação regional no estado do Paraná. Ele possui regras próprias que o diferenciam de outras variações como o truco paulista e o mineiro, e é muito presente no interior do estado, sendo comum em rodas de amigos e encontros familiares. Sua formação foi influenciada pela cultura local, com forte presença de elementos da tradição gaúcha, além de influências vindas da Argentina, combinadas com costumes típicos da região sul do Brasil."
//paranaense
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodotiracartas,
                    R.drawable.baralhovaziofoto,
                    "Baralho vazio",
                    "Antes de começar o jogo, remova todas as cartas 8, 9, 10 e os coringas — essas cartas não serão usadas. Quando o baralho estiver pronto, a partida pode começar."
//paranaense
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.cartasreisecofoto,
                    "Pirâmide de poder das cartas",
                    "No Truco paranaense,os naipes fazem total diferença na força das cartas. Se dois jogadores jogarem um K, sendo um de copas outro de paus,paus vence."            ));
//paranaense
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.mostragemtrucopaulista,
                    R.drawable.mostragemtrucopaulista,
                    "",
                    " Listamos as cartas da mais forte para a mais fraca. Lembre-se: os naipes só fazem a difereça quando são jogadas a critério de desempate."

//paranaense
            ));


            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.manilhatrucopaulista,
                    "Manilhas variaveis do truco paranaense",
                    "Manilhas variaveis do Truco paranaense, o numero das cartas manilhas é decidida tirando uma carta no final da distribuição de cartas e virando-lá "
//paranaense
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodocartasreiseco,
                    R.drawable.cruzdecartas,
                    "Jeito de jogar",
                    "O jogo tem três rodadas. Em cada uma, cada jogador apresenta uma carta. A carta mais forte vence a rodada. Quem vencer duas rodadas leva um ponto para cada jogador da dupla — ou seja, dois pontos no total. Ganha a dupla que alcançar os 12 pontos."
            ));
//paranaense
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodacruz,
                    R.drawable.fotomaope,
                    "Pé, Mão e Contra-pé",
                    "No truco, o 'pé' é o jogador que embaralha e joga por último — uma posição de vantagem. No início, o pé é sorteado e, ao final de cada partida, passa para o jogador à direita. O 'mão' é o primeiro a jogar (desvantagem) e fica à direita do pé. O 'contra-pé' é o penúltimo a jogar fica à esquerda do pé."
            ));
//paranaense
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomaope,
                    R.drawable.trucofoto,
                    "Truco !!!",
                    "Truco é o termo usado para aumentar o valor da partida. Gritando 'Truco!', a mão passa a valer 3 pontos. O adversário pode aumentar para 'Seis!' (6 pontos), depois para 'Nove!' (9 pontos) e, por fim, para 'Doze!'."
            ));
//paranaense

        }



        if ("Truco Paraense".equals(gameName)) {

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundoparaense,
                    R.drawable.cartasombra,
                    "Truco Paraense",
                    "O truco paraense surgiu como uma adaptação regional no estado do Pará. Ele possui regras próprias que o diferenciam de outras variações como o truco paulista e o mineiro, e é muito presente no interior do estado, sendo comum em rodas de amigos e encontros familiares. Sua formação foi influenciada pela cultura local, com forte presença de elementos da tradição, além de influências vindas de são paulo, combinadas com costumes típicos da região norte do Brasil."
//paraense
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodotiracartas,
                    R.drawable.baralhovaziofoto,
                    "Baralho vazio",
                    "Antes de começar o jogo, remova todas as cartas 8, 9, 10 e os coringas — essas cartas não serão usadas. Quando o baralho estiver pronto, a partida pode começar."
//paraense
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.cartasreisecofoto,
                    "Pirâmide de poder das cartas",
                    "No Truco paraense,os naipes fazem total diferença na força das cartas. Se dois jogadores jogarem um K, sendo um de copas outro de paus,paus vence."
            ));
//paraense
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.mostragemtrucopaulista,
                    R.drawable.mostragemtrucopaulista,
                    "",
                    " Listamos as cartas da mais forte para a mais fraca. Lembre-se: os naipes só fazem a difereça quando são jogadas a critério de desempate."

//paraense
            ));


            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.manilhatrucopaulista,
                    "Manilhas variaveis do truco paraense",
                    "Manilhas variaveis do Truco paraense, o numero das cartas manilhas é decidida tirando uma carta no final da distribuição de cartas e virando-lá "
//paraense
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodocartasreiseco,
                    R.drawable.cruzdecartas,
                    "Jeito de jogar",
                    "O jogo tem três rodadas. Em cada uma, cada jogador apresenta uma carta. A carta mais forte vence a rodada. Quem vencer duas rodadas leva um ponto para cada jogador da dupla — ou seja, dois pontos no total. Ganha a dupla que alcançar os 12 pontos."
            ));
//paraense
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodacruz,
                    R.drawable.fotomaope,
                    "Pé, Mão e Contra-pé",
                    "No truco, o 'pé' é o jogador que embaralha e joga por último — uma posição de vantagem. No início, o pé é sorteado e, ao final de cada partida, passa para o jogador à direita. O 'mão' é o primeiro a jogar (desvantagem) e fica à direita do pé. O 'contra-pé' é o penúltimo a jogar fica à esquerda do pé."
            ));
//paraense
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomaope,
                    R.drawable.trucofoto,
                    "Truco !!!",
                    "Truco é o termo usado para aumentar o valor da partida. Gritando 'Truco!', a mão passa a valer 3 pontos. O adversário pode aumentar para 'Seis!' (6 pontos), depois para 'Nove!' (9 pontos) e, por fim, para 'Doze!'."
            ));
//paraense

        }


        if ("Truco Capixaba".equals(gameName)) {

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.capaespirotsanto,
                    R.drawable.cartasombra,
                    "Truco capixaba",
                    "O truco capixaba surgiu como uma adaptação regional no estado do espirito santo. Ele possui regras próprias que o diferenciam de outras variações como o truco paulista e o mineiro, e é muito presente no interior do estado, sendo comum em rodas de amigos e encontros familiares. Sua formação foi influenciada pela cultura local, com forte presença de elementos da tradição, além de influências vindas de são paulo, combinadas com costumes típicos da região sudeste do Brasil."
//capixaba
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodotiracartas,
                    R.drawable.baralhovaziofoto,
                    "Baralho vazio",
                    "Antes de começar o jogo, remova todas as cartas 8, 9, 10 e os coringas — essas cartas não serão usadas. Quando o baralho estiver pronto,pode começar."
//capixaba
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.cartasreisecofoto,
                    "Pirâmide de poder das cartas",
                    "No Truco capixaba,os naipes fazem total diferença na força das cartas. Se dois jogadores jogarem um K, sendo um de copas outro de paus, a jogada é decidida por quem tem o naipe mais forte"
            ));
//capixaba
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.mostragemtrucopaulista,
                    R.drawable.mostragemtrucopaulista,
                    "",
                    " Listamos as cartas da mais forte para a mais fraca. Lembre-se: os naipes só fazem a difereça quando são jogadas a critério de desempate."

//capixaba
            ));


            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomanilhaspag,
                    R.drawable.manilhatrucopaulista,
                    "Manilhas variaveis do truco capixaba",
                    "Manilhas variaveis do Truco capixaba, o numero das cartas manilhas é decidida tirando uma carta no final da distribuição de cartas e virando-lá "
                    //corrigido
//capixaba
            ));

            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodocartasreiseco,
                    R.drawable.cruzdecartas,
                    "Jeito de jogar",
                    "O jogo tem três rodadas. Em cada uma, cada jogador apresenta uma carta. A carta mais forte vence a rodada. Quem vencer duas rodadas leva um ponto para cada jogador da dupla — ou seja, dois pontos no total. Ganha a dupla que alcançar os 12 pontos."
                    //corrigido
            ));
//capixaba
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodacruz,
                    R.drawable.fotomaope,
                    "Pé, Mão e Contra-pé",
                    "No truco, o 'pé' é o jogador que embaralha e joga por último — uma posição de vantagem. No início, o pé é sorteado e, ao final de cada partida, passa para o jogador à direita. O 'mão' é o primeiro a jogar (desvantagem) e fica à direita do pé. O 'contra-pé' é o penúltimo a jogar fica à esquerda do pé."
                    //corrigido
            ));
//capixaba
            slides.add(OnboardingPageFragment.newInstance(
                    R.drawable.fundodomaope,
                    R.drawable.trucofoto,
                    "Truco !!!",
                    "Truco é o termo usado para aumentar o valor da partida. Gritando 'Truco!', a mão passa a valer 3 pontos. O adversário pode aumentar para 'Seis!' (6 pontos), depois para 'Nove!' (9 pontos) e, por fim, para 'Doze!'."
                    //corrigido
            ));
//capixaba

        }


        viewPager.setAdapter(new OnboardingAdapter(this, slides));

        return view;
    }



}