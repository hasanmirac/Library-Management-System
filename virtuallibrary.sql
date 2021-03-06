PGDMP         2                 y            virtuallibrary    13.0    13.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16420    virtuallibrary    DATABASE     k   CREATE DATABASE virtuallibrary WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE virtuallibrary;
                postgres    false            �            1259    16421    account    TABLE     �   CREATE TABLE public.account (
    username character varying(10) NOT NULL,
    name character varying(15) NOT NULL,
    password character varying,
    sec_q character varying,
    answer character varying
);
    DROP TABLE public.account;
       public         heap    postgres    false            �            1259    16467    admin_account    TABLE     x   CREATE TABLE public.admin_account (
    username character varying NOT NULL,
    password character varying NOT NULL
);
 !   DROP TABLE public.admin_account;
       public         heap    postgres    false            �            1259    16459    book    TABLE     &  CREATE TABLE public.book (
    book_id character varying NOT NULL,
    name character varying NOT NULL,
    edition character varying NOT NULL,
    writer character varying NOT NULL,
    price character varying NOT NULL,
    pages character varying NOT NULL,
    publisher character varying
);
    DROP TABLE public.book;
       public         heap    postgres    false            �            1259    16483    issue    TABLE     �  CREATE TABLE public.issue (
    book_id character varying NOT NULL,
    name character varying NOT NULL,
    edition character varying NOT NULL,
    writer character varying NOT NULL,
    price character varying NOT NULL,
    pages character varying NOT NULL,
    student_id character varying NOT NULL,
    s_name character varying NOT NULL,
    f_name character varying NOT NULL,
    division character varying NOT NULL,
    year character varying NOT NULL,
    date_of_issue date
);
    DROP TABLE public.issue;
       public         heap    postgres    false            �            1259    16489    return    TABLE       CREATE TABLE public.return (
    student_id character varying,
    s_name character varying NOT NULL,
    f_name character varying NOT NULL,
    division character varying NOT NULL,
    year character varying NOT NULL,
    book_id character varying NOT NULL,
    book_name character varying NOT NULL,
    edition character varying NOT NULL,
    writer character varying NOT NULL,
    price character varying NOT NULL,
    pages character varying NOT NULL,
    doi character varying NOT NULL,
    dor character varying NOT NULL
);
    DROP TABLE public.return;
       public         heap    postgres    false            �            1259    16475    student    TABLE     �   CREATE TABLE public.student (
    student_id character varying NOT NULL,
    name character varying NOT NULL,
    father_name character varying NOT NULL,
    division character varying NOT NULL,
    year character varying NOT NULL
);
    DROP TABLE public.student;
       public         heap    postgres    false            �          0    16421    account 
   TABLE DATA           J   COPY public.account (username, name, password, sec_q, answer) FROM stdin;
    public          postgres    false    200   �       �          0    16467    admin_account 
   TABLE DATA           ;   COPY public.admin_account (username, password) FROM stdin;
    public          postgres    false    202          �          0    16459    book 
   TABLE DATA           W   COPY public.book (book_id, name, edition, writer, price, pages, publisher) FROM stdin;
    public          postgres    false    201   ?       �          0    16483    issue 
   TABLE DATA           �   COPY public.issue (book_id, name, edition, writer, price, pages, student_id, s_name, f_name, division, year, date_of_issue) FROM stdin;
    public          postgres    false    204   B       �          0    16489    return 
   TABLE DATA           �   COPY public.return (student_id, s_name, f_name, division, year, book_id, book_name, edition, writer, price, pages, doi, dor) FROM stdin;
    public          postgres    false    205          �          0    16475    student 
   TABLE DATA           P   COPY public.student (student_id, name, father_name, division, year) FROM stdin;
    public          postgres    false    203          ;           2606    16428    account Account_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.account
    ADD CONSTRAINT "Account_pkey" PRIMARY KEY (username);
 @   ALTER TABLE ONLY public.account DROP CONSTRAINT "Account_pkey";
       public            postgres    false    200            A           2606    16482    student Student_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.student
    ADD CONSTRAINT "Student_pkey" PRIMARY KEY (student_id);
 @   ALTER TABLE ONLY public.student DROP CONSTRAINT "Student_pkey";
       public            postgres    false    203            ?           2606    16474     admin_account admin_account_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.admin_account
    ADD CONSTRAINT admin_account_pkey PRIMARY KEY (username);
 J   ALTER TABLE ONLY public.admin_account DROP CONSTRAINT admin_account_pkey;
       public            postgres    false    202            =           2606    16466    book book_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (book_id);
 8   ALTER TABLE ONLY public.book DROP CONSTRAINT book_pkey;
       public            postgres    false    201            �   X   x�KI�K�M�L�P�FƜ��%
��
���E
��%�E��
y���
�Pu\�ŉy��E�ɜ &H��)�������F3C�=... ;o#|      �      x�KI�K�M�442����� (��      �   �  x�m�Mn�0�ףS� A�?��ұ�QpP @7ckR�(����1���t���{e$�@{G��޼�72	`���]|�Z�b^�ޔ�w҇ M`���3"S{�i���#���4YѐpL�� ��rc�rOʬh�� ��Y#`��F�V�Fyi��#�B�[q_���u�r�s45dA^������뼘�2�%�^�ܢ�!�@��K[V#*J#����9��u�፝S� ���F8��!���@��#H��ڗj�����0�!+��K;"'����w?�9��erNe�/O�&'���*1�T�3�5U�;Y�ÈS	/���F�D���kO�v��uݹ�_�ōxR��W����r��X!S+�����uG��_m՚�WZi4k�>�ki2��/*Vd��K}��V�2q/s��X*�С�������8�7��>SA��l%7"LX�?T�W�1'}#�0��n��[�M�Xy�>���,�j$���yZ57      �   �  x���=��0���)x�x!R�~�]�Yc7�Rih{DR��^ 7H@eڸI�N�B���v S�}3���8��ʡF�Zd�O[)�����M�d��+�Go�8� dk<���n���tJ�lݟ7^*Bθ�qdY��]:v�����{zfse+lс�бJ�k*���(���sX��
��p�L��H������gWk��q8]�����ԁ=P	<��H@&)|ģ�g��+4���m���Y�F9l����_$�(��<b[䭏@�xh��R�gx*��K�E��`SQZ_Na��<Ȥ�,d����-�u�n5�1�Fc�>��<��\^����{쿢٢#�Sv�
���_�N��!���x�&O�s�g�q���i�['W��a�G;d�p����k������rb��������P�bԭ� �i�h���-�_�u�O7A�"�
      �   �   x���MN�0��/���6�q�*P$��Ab3��Xu�H\�R�@��b�A���f�Iߛ����p�q���و����(�魝C�i�R`�A<�����������b���� ��,!���R-T��Z�EmV΢9��L�*�Jbc�'ڦtp�8�ٵ=���OB�������������sǎ����W��|J�-�!�b}��ཅ��ڂ8��"�J��,l��EQ| �l�      �   �   x�]��j�0E端�[��fl���ɒ�t�5~XR�$��N�B�g��_U�N���+U��:K��r�ru�u����m ţ�x2�v�:�|�Q	Um�B���kȮ{2ܣ2W��pV;̟��)Zr?�Lz�F�d��hd�=�=j��-E�oQ~ǡO��P=��>\��R�]Q�>�v'����A娭���{#�g^������e��z�!�|[     