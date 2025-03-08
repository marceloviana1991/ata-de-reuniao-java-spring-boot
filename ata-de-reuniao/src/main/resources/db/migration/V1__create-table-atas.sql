-- Criação da tabela 'atas'
CREATE TABLE atas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    numero_da_reuniao INT,
    data DATE,
    quantidade_de_participantes INT,
    quantidade_de_ingressos INT,
    quantidade_de_visitantes INT,
    aberta BOOLEAN,
    servico BOOLEAN,
    secretario VARCHAR(255),
    tesoureiro VARCHAR(255),
    rsg VARCHAR(255),
    rsg_suplente VARCHAR(255),
    setima_tradicao DECIMAL(10,2),
    venda_de_literatura DECIMAL(10,2),
    saldo_anterior DECIMAL(10,2),
    aluguel DECIMAL(10,2),
    manutencao_da_sala DECIMAL(10,2),
    despesas_com_servidor DECIMAL(10,2),
    compra_de_literatura DECIMAL(10,2),
    observacoes VARCHAR(1000)
);