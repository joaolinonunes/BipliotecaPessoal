/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.view;

import br.aluno.joao.bipliotecapessoal.data.ObraData;
import br.aluno.joao.bipliotecapessoal.model.CategoriaModel;
import br.aluno.joao.bipliotecapessoal.model.ObraModel;
import br.aluno.joao.bipliotecapessoal.model.TipoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucienecavalcanti
 */
public class JIFObras extends javax.swing.JInternalFrame {
    ObraModel obj;
    ObraData DAO;

    /**
     * Creates new form JIFObras
     */
    public JIFObras() {
        try{
        obj = new ObraModel();
        DAO = new ObraData();
        initComponents();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlId = new javax.swing.JLabel();
        jlId2 = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jtAutor = new javax.swing.JTextField();
        jlAutor = new javax.swing.JLabel();
        jtLocal = new javax.swing.JTextField();
        jlLocal = new javax.swing.JLabel();
        jtAno = new javax.swing.JTextField();
        jlAno = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<String>();
        jcbTipo = new javax.swing.JComboBox<String>();
        jlTipo = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Obras");

        jlId.setText("Id");

        jlId2.setText("0");

        jlDescricao.setText("Descrição");

        jtDescricao.setEnabled(false);

        jtAutor.setEnabled(false);
        jtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAutorActionPerformed(evt);
            }
        });

        jlAutor.setText("Autor");

        jtLocal.setEnabled(false);
        jtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLocalActionPerformed(evt);
            }
        });

        jlLocal.setText("Local");

        jtAno.setEnabled(false);

        jlAno.setText("Ano");

        jlCategoria.setText("Categoria");

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        jcbCategoria.setEnabled(false);

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4" }));
        jcbTipo.setEnabled(false);

        jlTipo.setText("Tipo");

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa");

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Autor", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlLocal)
                                            .addComponent(jlAutor))
                                        .addGap(27, 27, 27)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCategoria)
                                    .addComponent(jlTipo)
                                    .addComponent(jlAno))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlId2)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAutor)
                    .addComponent(jtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLocal)
                    .addComponent(jtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAno)
                    .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCategoria)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipo)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.aluno.joao.bipliotecapessoal.extras.Formularios.limparCampos(this);
        br.aluno.joao.bipliotecapessoal.extras.Formularios.tratarCampos(this, false);
        br.aluno.joao.bipliotecapessoal.extras.Formularios.limparTabela(jtbDados);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtPesquisa.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        /*
        try {
            if(DAO.excluir(Integer.parseInt(jlId2.getText()))){
                JOptionPane.showMessageDialog(this, "Excluído com sucesso");
                jbCancelarActionPerformed(evt);
                jtPesquisa.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o registro: "+e.getMessage());
        }*/
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        br.aluno.joao.bipliotecapessoal.extras.Formularios.limparCampos(this);
        br.aluno.joao.bipliotecapessoal.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if(validarCampos()){
                if(preencherObjeto()){
                    if(DAO.incluir(obj)){
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                        jbCancelarActionPerformed(evt);
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao salvar");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAutorActionPerformed

    private void jtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLocalActionPerformed
    ArrayList<ObraModel> lista = new ArrayList<>();
    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
    try {
        if(jtPesquisa.getText().trim().length()>=1){
        lista = DAO.pesquisar(jtPesquisa.getText());
        DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
        mp.setNumRows(0);
        for(ObraModel ob: lista){
            mp.addRow(new String[]{""+ob.getId(),ob.getDescricao(),ob.getAutor(), ""+ob.getAno()});//linha de dados
            //mp.addRow(new String[]{String.valueOf(ob.getId()),ob.getDescricao(),ob.getAutor(), String.valueOf(ob.getAno())});//linha de dados
        }
        }else if (jtPesquisa.getText().trim().length()==0){
            DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
        mp.setNumRows(0);
        }
    } catch (Exception e) {
       JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
    }
        
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
       try {
            int linha = jtbDados.getSelectedRow();
            jlId2.setText(""+lista.get(linha).getId());
            jtDescricao.setText(lista.get(linha).getDescricao());
            jtLocal.setText(lista.get(linha).getLocal());
            jtAutor.setText(lista.get(linha).getAutor());
            jtAno.setText(""+lista.get(linha).getAno());
            for(int i=0;i<listaCategorias.size();i++)
                if(listaCategorias.get(i).getId()==lista.get(linha).getCategoria().getId())
                    jcbCategoria.setSelectedIndex(i);
            for(int i=0;i<listaTipos.size();i++)
                if(listaTipos.get(i).getId()==lista.get(linha).getTipo().getId())
                    jcbTipo.setSelectedIndex(i);

 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlLocal;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JTextField jtAno;
    private javax.swing.JTextField jtAutor;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtLocal;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtbDados;
    // End of variables declaration//GEN-END:variables
private boolean validarCampos(){
    if(jtDescricao.getText().trim().length()<3){
        JOptionPane.showMessageDialog(this, "Digite uma descrição com pelo menos 3 caracteres");
        return false;
    }
    if(jtAno.getText().trim().length()<2){
        JOptionPane.showMessageDialog(this, "Ano inválido");
        return false;
    }
    return true;
}
private boolean preencherObjeto() throws Exception {
    obj.setId(Integer.parseInt(jlId2.getText()));
    obj.setDescricao(jtDescricao.getText());
    obj.setAutor(jtAutor.getText());
    obj.setLocal(jtLocal.getText());
    obj.setAno(Integer.parseInt(jtAno.getText()));
    obj.setCategoria(new CategoriaModel(1, ""));
    obj.setTipo(new TipoModel(4, ""));
    return true;
}
}
